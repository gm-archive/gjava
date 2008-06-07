////////////////////////////////////////////////
// Created by Satori Canton
// (c) 2006 ActionScript.com
// Licensed under a Creative Commons Attribution 2.5 License.
// http://creativecommons.org/licenses/by/2.5/
//
// Written with PrimalScript Professional
////////////////////////////////////////////////

import com.actionscript.SatoriArray;
import mx.utils.Delegate;
import flash.filters.BlurFilter;
class com.actionscript.text.TextScript {
   public static var constructiveEffects:Array = ["typewriter", "zoomIn", "zoomOut", "blurIn", "dropIn", "randomDropIn"];
   public static var destructiveEffects:Array = ["removeTypewriter", "removeZoomIn", "removeZoomOut", "removeBlurIn", "removeDropIn", "removeRandomDropIn"];
   private static var _instance:TextScript;
   //the following are used in Transition Functions
   //not actually used in this class
   private var frameCount:Number;
   private var delay:Number;
   private var _visible:Boolean;
   private var _alpha:Number;
   private var _xscale:Number;
   private var _xTarget:Number;
   private var _x:Number;
   private var _yscale:Number;
   private var _yTarget:Number;
   private var _y:Number
   private var _velocity:Number;
   private var _gravity:Number;
   private var onEnterFrame:Function;
   private var removeSelf:Function;
   private var filters:Array;
   private var _height:Number;
   private var _width:Number
   private var _rVelocity:Number;
   private var phraseHeight:Number;
   private var phraseWidth:Number;
   private var characterArray:Array;
   private var characterLength:Number;
      function TextScript() {
   }
   public static function getInstance():TextScript {
       if(_instance == undefined) {
           _instance = new TextScript();
       }
       return(_instance);
   }
   public static function createEffect(scope:MovieClip, phrase:String, x:Number, y:Number, format:TextFormat, delay:Number, effect:Function):MovieClip {
       var m:MovieClip = TextScript.createText(scope, phrase, x, y, format);
       TextScript.configureEffect(m, effect, delay);
       return(m);
   }
   public static function removeEffect(m:MovieClip, delay:Number, effect:Function):Void {
       TextScript.configureEffect(m, effect, delay);
   }
   public static function getRandomConstructive():Function {
       return TextScript[TextScript.getRandomItem(TextScript.constructiveEffects)];
   }
   public static function getRandomDestructive():Function {
       return TextScript[TextScript.getRandomItem(TextScript.destructiveEffects)];
   }
   ///////////////////////////////////////////
   //  Predefined Effects
   ///////////////////////////////////////////
   public static function typewriter(scope:MovieClip, phrase:String, x:Number, y:Number, format:TextFormat, delay:Number):MovieClip {
       return createEffect(scope, phrase, x, y, format, delay, TextScript.getInstance().typewriterTransition);
   }
   public static function removeTypewriter(m:MovieClip, delay:Number):Void {
       removeEffect(m, delay, TextScript.getInstance().removeTypewriterTransition);
   }
   public static function zoomIn(scope:MovieClip, phrase:String, x:Number, y:Number, format:TextFormat, delay:Number):MovieClip {
       return createEffect(scope, phrase, x, y, format, delay, TextScript.getInstance().zoomInTransition);
   }
   public static function removeZoomIn(m:MovieClip, delay:Number):Void {
       removeEffect(m, delay, TextScript.getInstance().removeZoomInTransition);
   }
   public static function zoomOut(scope:MovieClip, phrase:String, x:Number, y:Number, format:TextFormat, delay:Number):MovieClip {
       return createEffect(scope, phrase, x, y, format, delay, TextScript.getInstance().zoomOutTransition);
   }
   public static function removeZoomOut(m:MovieClip, delay:Number):Void {
       removeEffect(m, delay, TextScript.getInstance().removeZoomOutTransition);
   }
   public static function blurIn(scope:MovieClip, phrase:String, x:Number, y:Number, format:TextFormat, delay:Number):MovieClip {
       return createEffect(scope, phrase, x, y, format, delay, TextScript.getInstance().blurInTransition);
   }
   public static function removeBlurIn(m:MovieClip, delay:Number):Void {
       removeEffect(m, delay, TextScript.getInstance().removeBlurInTransition);
   }
   public static function dropIn(scope:MovieClip, phrase:String, x:Number, y:Number, format:TextFormat, delay:Number):MovieClip {
       return createEffect(scope, phrase, x, y, format, delay, TextScript.getInstance().dropInTransition);
   }
   public static function removeDropIn(m:MovieClip, delay:Number):Void {
       removeEffect(m, delay, TextScript.getInstance().removeDropInTransition);
   }
   public static function randomDropIn(scope:MovieClip, phrase:String, x:Number, y:Number, format:TextFormat, delay:Number):MovieClip {
       return createEffect(scope, phrase, x, y, format, delay, TextScript.getInstance().randomDropInTransition);
   }
   public static function removeRandomDropIn(m:MovieClip, delay:Number):Void {
       removeEffect(m, delay, TextScript.getInstance().removeRandomDropInTransition);
   }
   ///////////////////////////////////////////
   //  Private Transition Functions
   //  **************************************************
   //   custom effects can be modeled from these functions
   //  using createEffect and removeEffect
   ///////////////////////////////////////////
   private function randomDropInTransition():Void {
       if(Math.floor(Math.random()*15) == 0 || this.frameCount++ > 60) {
           this._yTarget = this._y;
           this._y = -this._height - Stage.height;
           this._visible = true;
           this._velocity = 0;
           this._gravity = 2;
           this.onEnterFrame = function() {
               this._velocity += this._gravity;
               this._y += this._velocity;
               this.filters = [new BlurFilter(0, Math.abs(this._velocity), 1)];
               if(this._y > this._yTarget) {
                   this._y = this._yTarget;
                   if(this._velocity < 1) {
                       this.filters = [];
                       this._y = this._yTarget;
                       this.onEnterFrame = undefined;
                   }
                   this._velocity = -this._velocity/3.5;
               }
           }
       }
   }
   private function removeRandomDropInTransition():Void {
       if(Math.floor(Math.random()*15) == 0 || this.frameCount++ > 60) {
           this._velocity = -10;
           this._gravity = 2;
           this._rVelocity = Math.random() * 8 - 4;
           this.onEnterFrame = function() {
               this._velocity += this._gravity;
               this._rotation += this._rVelocity;
               this._y += this._velocity;
               this.filters = [new BlurFilter(0, Math.abs(this._velocity), 1)];
               if(this._y > Stage.height){
                   this.removeSelf();
               }
           }
       }
   }
   private function dropInTransition():Void {
       if(this.frameCount++ > this.delay) {
           this._yTarget = this._y;
           this._y = -this._height - Stage.height;
           this._visible = true;
           this._velocity = 0;
           this._gravity = 2;
           this.onEnterFrame = function() {
               this._velocity += this._gravity;
               this._y += this._velocity;
               this.filters = [new BlurFilter(0, Math.abs(this._velocity), 1)];
               if(this._y > this._yTarget) {
                   this._y = this._yTarget;
                   if(this._velocity < 2) {
                       this.filters = [];
                       this._y = this._yTarget;
                       this.onEnterFrame = undefined;
                   }
                   this._velocity = -this._velocity/3.5;
               }
           }
       }
   }
   private function removeDropInTransition():Void {
       if(this.frameCount++ > this.delay) {
           this._velocity = -10;
           this._gravity = 2;
           this._rVelocity = Math.random() * 8 - 4;
           this.onEnterFrame = function() {
               this._velocity += this._gravity;
               this._rotation += this._rVelocity;
               this._y += this._velocity;
               this.filters = [new BlurFilter(0, Math.abs(this._velocity), 1)];
               if(this._y > Stage.height){
                   this.removeSelf();
               }
           }
       }
   }
   private function blurInTransition():Void {
       if(this.frameCount++ > this.delay) {
           this.onEnterFrame = function() {
               this.frameCount += 2;
               var n:Number = 30 - (this.frameCount - this.delay);
               this.filters = [new BlurFilter(n, n, 1)];
               this._visible = true;
               this._alpha = 100 - (n * 3);
               if(n < 1) {
                   this._alpha = 100;
                   this.onEnterFrame = undefined;
               }
           }
       }
   }
   private function removeBlurInTransition():Void {
       if(this.frameCount++ > this.delay) {
           this.onEnterFrame = function() {
               this.frameCount += 2;
               var n:Number = this.frameCount - this.delay;
               this.filters = [new BlurFilter(n, n, 1)];
               this._alpha = 100 - (n * 3);
               if(n > 30) {
                   this.removeSelf();
               }
           }
       }
   }
   private function zoomInTransition():Void {
       if(this.frameCount++ > this.delay) {
           this._visible = true;
           this._alpha = 0;
           this._xscale = this._yscale = 0;
           this.onEnterFrame = function() {
               this._xscale -= (this._xscale - 100)/10;
               this._yscale = this._xscale;
               if(this._alpha < 100) {
                   this._alpha += 4;
               }
               if(this._xscale == 100) {
                   this.onEnterFrame = undefined;
               }
           }
       }
   }
   private function removeZoomInTransition():Void {
       if(this.frameCount++ > this.delay) {
           this.onEnterFrame = function() {
               this._xscale -= (this._xscale)/10;
               this._yscale = this._xscale;
               this._alpha -= 5;
               if(this._alpha < 1 || this._xscale < 1) {
                   this.removeSelf();
               }
           }
       }
   }
   private function zoomOutTransition():Void {
       if(this.frameCount++ > this.delay) {
           this._visible = true;
           this._alpha = 0;
           this._xscale = this._yscale = 500;
           this.onEnterFrame = function() {
               this._xscale -= (this._xscale - 100)/10;
               this._yscale = this._xscale;
               if(this._alpha < 100) {
                   this._alpha += 4;
               }
               if(this._xscale == 100) {
                   this.onEnterFrame = undefined;
               }
           }
       }
   }
   private function removeZoomOutTransition():Void {
       if(this.frameCount++ > this.delay) {
           this.onEnterFrame = function() {
               this._xscale -= (this._xscale - 500)/10;
               this._yscale = this._xscale;
               this._alpha -= 5;
               if(this._alpha < 1) {
                   this.removeSelf();
               }
           }
       }
   }
   private function typewriterTransition(m:MovieClip):Void {
       this._visible = this.frameCount++ > this.delay;
   }
   private function removeTypewriterTransition(m:MovieClip):Void {
       if (this.frameCount++ > this.delay) {
           this.removeSelf();
       }
   }
   ///////////////////////////////////////////
   //  Private Static Methods
   ///////////////////////////////////////////
   private static function configureEffect(m:MovieClip, effect:Function, delay:Number) {
       var l:Number = m.characterArray.length;
       while(l--) {
           var char:MovieClip = m.characterArray[l];
           char.delay = delay * l;
           char.frameCount = 0;
           char.onEnterFrame = Delegate.create(char, effect);
       }
   }
   private static function createText(scope:MovieClip, phrase:String, x:Number, y:Number, format:TextFormat):MovieClip {
       var teText:MovieClip = scope.createEmptyMovieClip("ascTextPhrase" + scope.getNextHighestDepth(), scope.getNextHighestDepth());
       teText.characterArray = new SatoriArray();
       teText.remove = function(m:MovieClip):Void {
           this.characterArray.removeItem(m);
           m.removeMovieClip();
           if(this.characterArray.length == 0) {
               this.removeMovieClip();
           }
       }
       var l:Number = phrase.length;
       for(var i:Number = 0; i < l; i++) {
           var m:MovieClip = TextScript.createCharacter(teText, phrase.substr(i, 1), format);
           m.removeSelf = function() {
               this._parent.remove(this);
           }
           m._x = x;
           m._y = y;
           m.characterLength = l;
           teText.characterArray.push(m);
           x += format.getTextExtent(m.field.text).width;
       }
       while (l--) {
           teText.characterArray[l].characterArray = teText.characterArray.slice(0);
           teText.characterArray[l].phraseHeight = teText._height;
           teText.characterArray[l].phraseWidth = teText._width;
       }
       return(teText);
   }
   private static function createCharacter(scope:MovieClip, s:String, tf:TextFormat):MovieClip {
       var m:MovieClip = scope.createEmptyMovieClip("ascTextCharacter" + scope.getNextHighestDepth(), scope.getNextHighestDepth());
       m.createTextField("field", 1, 0, 0, 100, 100);
       m.field.embedFonts = true;
       m.field.selectable = false;
       m.field.text = s;
       m.field.setTextFormat(tf);
       m.field.autoSize = "left";
       m.cacheAsBitmap = true;
       m._visible = false;
       return(m);
   }
   public static function getRandomItem(a:Array):String {
       var n:Number = Math.floor(Math.random()*a.length);
       return a[n];
   }
}


