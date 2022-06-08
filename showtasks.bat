call runcrud.bat
goto runbrowser

:runbrowser
start "C:\Program Files\Google\Chrome\Application\chrome.exe" http://localhost:8080/crud/v1/tasks/getTasks
echo Chrome has started
pause
goto end

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished.