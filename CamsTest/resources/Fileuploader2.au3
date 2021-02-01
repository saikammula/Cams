;ControlFocus("Open","","Edit1")
;ControlSetText("Open","","Edit1","C:\Users\bsrikanth\Downloads\ImmunizationReport.pdf")
;ControlClick("Open","","Button1")

$currentdir = @ScriptDir
;$filename = $currentdir&
;ConsoleWrite("file present in the path " & $currentdir);
;MsgBox($currentdir, "");
$title = "Open";
If(WinExists($title)) Then
WinActivate($title);
ControlSend($title, "",  "",$currentdir&"\ImmunizationReport.pdf", 9);
ControlSend($title,  "", "",  "{ENTER}");
EndIf