call runcrud.bat
if %ERRORLEVEL% == "0" goto runbrowser
echo.
echo runcrud has errors - breaking work
goto fail

:runbrowser
@echo off
start "" "C:\Program Files\Google\Chrome\Application\chrome.exe"
echo Firefox has started
pause
goto end

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished.