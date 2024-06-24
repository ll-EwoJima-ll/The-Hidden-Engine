// What Not To Do:
- You shouldn't sleep your program as it will cause your window to go unresponsive, and make your window very slow even after the time is up.
  Instead, use the Time.ThreadTimer() function to run a timer in a thread that won't interfere with your application.

