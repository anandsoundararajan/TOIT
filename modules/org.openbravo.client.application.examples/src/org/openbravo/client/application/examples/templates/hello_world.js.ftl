/* jslint */
isc.defineClass("OBAPPEX_HelloWorldButtonView", "Button").addProperties({
  title: "Click me",
  overflow: "visible",
  width: 100,
  layoutAlign: "center",
  showRollOver: false,
  showFocused: false,
  showDown: false,
  click: function() {
    isc.say(OB.I18N.getLabel('OBAPPEX_SayHello', ['${data.name}']));
  }
});