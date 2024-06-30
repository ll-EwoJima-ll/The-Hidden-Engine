package HiddenEngine;
import static org.lwjgl.glfw.GLFW.glfwWindowHint;
import static org.lwjgl.glfw.GLFW.GLFW_REFRESH_RATE;
import static org.lwjgl.glfw.GLFW.glfwSwapBuffers;
import static org.lwjgl.glfw.GLFW.glfwPollEvents;
import static org.lwjgl.glfw.GLFW.glfwWindowShouldClose;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glClearColor;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;

public abstract class Frame {

    public static void Update(float DeltaTime) {
        int TimeToChange = (int) Time.StartMilliTime();
        boolean Changing = true;
        Window.SetRGB(100, 200, 150, 15);
        //Window.ChangeScene();
        // Checks if it's time to switch yet
        while(Changing == true) {
            if (TimeToChange >= DeltaTime) {
                Changing = false;
            }
        }
    }
    
    public static void CurrentScene() {

    }

    //int FPS; // Frames Per Second
    int CurrentFramesRendered;
    long LoopTime;
    boolean FirstLoop = true;
    long CurrentTime;
    long LastTime;
    public void LoopFrame(long Window) {
        long loopstart = Time.StartMilliTime();
        while (!glfwWindowShouldClose(Window)) {
            glfwWindowHint(GLFW_REFRESH_RATE, new Window().FrameLimit);
            // Poll events (Key/mouse events)
            glfwPollEvents();
            
            new Window();
            // Set The RGB
            glClearColor(HiddenEngine.Window.NRed, HiddenEngine.Window.NGreen, HiddenEngine.Window.NBlue, HiddenEngine.Window.NAlpha);
            
            // Clears the window buffer
            glClear(GL_COLOR_BUFFER_BIT);

            // Swaps the buffers to the last buffer sent to the hadle
            glfwSwapBuffers(Window);

            // Replace this with the Time.GetTimeInSeconds(); function
            CurrentTime = Time.GetDiffInMilliSeconds(loopstart);
            if (CurrentTime >= LastTime + 1000) {
                System.out.println(CurrentFramesRendered);
                CurrentFramesRendered = 0;
                LastTime = CurrentTime;
            }
            
            CurrentFramesRendered++;
            LoopTime = LoopTime + CurrentTime;
            FirstLoop = false;
        }

        //long CurrentTime = Time.GetDiffInMilliSeconds(loopstart);
        //System.out.println(CurrentTime);
    }
}