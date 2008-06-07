class org.iteratif.UI.UIMovieClipLoader {
	private var container_mc:MovieClip;
	private var preloader_mc:MovieClip;
	private var loader_mc:MovieClip;
	private var loader:MovieClipLoader;
	
	// Position de votre chargeur
	private var xpos:Number;
	private var ypos:Number;
	
	// Variables pour les couleurs d'apparence de votre chargeur
	public var borderColor:Number;
	public var backGroundColor:Number;
	public var loaderColor:Number;
	
	public function UIMovieClipLoader(xpos:Number, ypos:Number, l:MovieClipLoader) {
		borderColor = 0x000000;
		backGroundColor = 0xFFFFFF;
		loaderColor = 0xFF9966;
		
		this.xpos = xpos;
		this.ypos = ypos;
		
		loader = l;
		// On attribut la classe elle meme pour
		// effectuer les changement nécessaire
		// au visuel lors du chargement.
		loader.addListener(this);
	}
	
	/**
	* On creer le visuel du chargeur en debut de chargement
	*/
	private function onLoadStart() {
		create();
	}
	
	/**
	* On suit la progression de facon à faire avancer la barre de progression
	*/
	private function onLoadProgress(target_mc:MovieClip, loadedBytes:Number, totalBytes:Number) {
		var pourcentage = Math.round(loadedBytes/totalBytes*100);
		
		// tant qu'on est pas arrivé au bout
		if (pourcentage < 100) {
			// en avant
			loader_mc._x = pourcentage - 100;
		}
	}
	
	private function onLoadComplete() {
		// Lorsque c'est charge on supprimer la barre
		preloader_mc.removeMovieClip();
	}
	
	private function create() {
		preloader_mc = getContainer().createEmptyMovieClip("preloader_mc",
							getContainer().getNextHighestDepth());
		preloader_mc._x = xpos;
		preloader_mc._y = ypos;

		createBorder(preloader_mc);
		createBackGround(preloader_mc);
		loader_mc = createLoader(preloader_mc);
		createMask(preloader_mc,loader_mc);
	}
	
	private function createMask(mc:MovieClip, target:MovieClip) {
		var mask_mc:MovieClip = mc.createEmptyMovieClip("mask_mc",3);
		with(mask_mc) {
			beginFill(0x000000);
			moveTo(3,3);
			lineTo(96,3);
			lineTo(96,7);
			lineTo(3,7);
			endFill();
		}
		
		target.setMask(mask_mc);
	}
	
	private function createBorder(mc:MovieClip) {
		var border_mc:MovieClip = mc.createEmptyMovieClip("border_mc",0);
		with(border_mc) {
			beginFill(this.borderColor);
			moveTo(0,0);
			lineTo(100,0);
			lineTo(100,10);
			lineTo(0,10);
			endFill();
		}
	}
	
	private function createBackGround(mc:MovieClip) {
		var background_mc:MovieClip = mc.createEmptyMovieClip("background_mc",1);
		with(background_mc) {
			beginFill(this.backGroundColor);
			moveTo(1,1);
			lineTo(99,1);
			lineTo(99,9);
			lineTo(1,9);
			endFill();
		}
	}
	
	private function createLoader(mc:MovieClip):MovieClip {
		var l_mc = mc.createEmptyMovieClip("loader_mc",2);
		with(l_mc) {
			beginFill(this.loaderColor);
			moveTo(0,0);
			lineTo(100,0);
			lineTo(100,10);
			lineTo(0,10);
			endFill();
			
			_x = -100;
			_y = 0;
		}
		
		return l_mc;
	}
	
	/**
	* Permet de definir le conteneur du chargeur
	*/
	public function setContainer(o:MovieClip) {
		container_mc = o;
	}
	
	/**
	* Permet de recuperer le conteneur (_root par defaut)
	*/
	public function getContainer():MovieClip {
		if(container_mc == null) {
			container_mc = _root;
		}
		return container_mc;
	}
}