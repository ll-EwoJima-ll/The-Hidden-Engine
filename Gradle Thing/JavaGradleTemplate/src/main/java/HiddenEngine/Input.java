package HiddenEngine;

import static org.lwjgl.glfw.GLFW.glfwGetCursorPos;
import static org.lwjgl.glfw.GLFW.glfwSetCursor;
import static org.lwjgl.glfw.GLFW.glfwGetKey;

import java.nio.DoubleBuffer;

public class Input {
//import static org.lwjgl.glfw.GLFW.glfwGetCursorPos;

    public static DoubleBuffer GetPosX(long Window, DoubleBuffer x, DoubleBuffer y) {
       glfwGetCursorPos(Window, x, y);
       return x;
    }
    public static DoubleBuffer GetPosY(long Window, DoubleBuffer x, DoubleBuffer y) {
        glfwGetCursorPos(Window, x, y); 
        return y;
     }

    public static void SetPos(int x, int y, boolean SetCenter) {
        glfwSetCursor(x, y);
    }

    public void Pressed(long WindowHandle, int Key) {
        @SuppressWarnings("unused")
        int Gk = glfwGetKey(WindowHandle, Key);
    }

    public void Joystick() {

    }
}
