function load() {
    console.log('load');
    var listener = new ResizeListener();
    if (listener._matchMediaQueryList) {
        listener._handleChange(listener._matchMediaQueryList);
    }
}

function ResizeListener() {
    console.log('ResizeListener()');
    this.Init();
}

AdfObject.createSubclass(ResizeListener, AdfObject);
/*768*/
ResizeListener.prototype.Init = function () {
    console.log('ResizeListener()');
    
    this._matchMediaQueryList = window.matchMedia("screen and (max-height:768px)");
    this._matchMediaQueryList.addListener(this._handleChange);
}

ResizeListener.prototype._handleChange = function (_matchMediaQueryList) {

    var document = AdfPage.PAGE.findComponent("d1");

    if (_matchMediaQueryList.matches) {
    
        AdfCustomEvent.queue(document, "customEvent", {screenSize : 'portrait'}, true);
        
    }
    else {
        AdfCustomEvent.queue(document, "customEvent", { screenSize : 'landscape' }, true);
    }
}