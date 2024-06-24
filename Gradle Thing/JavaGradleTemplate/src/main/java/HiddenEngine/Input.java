package HiddenEngine;

import static org.lwjgl.glfw.GLFW.glfwGetCursorPos;
import static org.lwjgl.glfw.GLFW.glfwSetCursor;
import static org.lwjgl.glfw.GLFW.glfwGetKey;

import java.nio.DoubleBuffer;

public class Input {
//import static org.lwjgl.glfw.GLFW.glfwGetCursorPos;

    public static double GetPosX(long Window, double x, double y) {
       glfwGetCursorPos(Window, x, y);
       Math.floor(x);

       return x;
    }

    public static void SetPos(int x, int y, boolean SetCenter) {
        glfwSetCursor(x, y);
    }

    public void Pressed(long WindowHandle, int Key) {
        int Gk = glfwGetKey(WindowHandle, Key);
    }

    public void Joystick() {

    }
}
