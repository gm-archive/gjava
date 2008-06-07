/*
created by Satori Canton
(c) 2005 ActionScript.com
*/
class com.actionscript.SatoriArray extends Array {
	public function SatoriArray () {
		var l:Number = arguments.length;
		for (var i:Number = 0; i < l; i ++) {
			this[i] = arguments [i];
		}
	}
	public function pull(x:Number):Object {
		var temp:Object = this[x];
		this.splice(x, 1);
		return (temp);
	}
	public function removeItem(o:Object):Boolean {
		var l:Number = this.length;
		while(l--) {
			if(this[l] == o) {
				this.splice(l, 1);
				return true;
			}
		}
		return false;
	}
	public function addItemAt(x:Number, item:Object):Number {
		var l:Number = this.length
		while (l -- > x) {
			this [l + 1] = this [l];
		}
		this [x] = item;
		return (this.length);
	}
	public function shuffle():Void {
		this.sort (this.RANDOMSHUFFLE);
		this.sort (this.RANDOMSHUFFLE);
		this.sort (this.RANDOMSHUFFLE);
		this.sort (this.RANDOMSHUFFLE);
	}
	public function RANDOMSHUFFLE():Number {
		return (Math.floor (Math.random () * 3) - 1);
	}
}
