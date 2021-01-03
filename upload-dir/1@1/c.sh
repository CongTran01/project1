@echo off
for /l %%i in (1, 1, 100) do (
	gentest.exe %%i
	checker.exe
	sol.exe
	fc check.txt output.txt
	if errorlevel 1 goto :eof
	echo Test %%i correct
)