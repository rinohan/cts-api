call runcrud.bat
if %ERRORLEVEL% == "0" goto runbrowser
echo.
echo runcrud has errors - breaking work
goto fail

:runbrowser
@echo off
start "" C:\Program Files\Mozilla Firefox\firefox.exe" http://localhost:8080/crud/v1/task/getTasks
echo Firefox has started
pause
goto end

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished.