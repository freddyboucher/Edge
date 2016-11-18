MS Edge issue
===========

To run development mode use the Maven Plugin for GWT, first prepare the webapp:

`mvn war:exploded -Dgwt.skipCompilation=true`

then

`mvn gwt:devmode`

To compile your project for deployment, just type `mvn clean package`.

Open **MS Edge** browser to experience the bug.

Demo at: https://ms-edge-issue.appspot.com/

The bug happens in **prod** but also in **SuperDevMode**.

MS Edge **F12 Developer Tools** must be closed or if you need it, in the **Debugger** tab, ensure **Debugger disconnected** is selected (as soon as you attach the debugger, the bug won't happen again).