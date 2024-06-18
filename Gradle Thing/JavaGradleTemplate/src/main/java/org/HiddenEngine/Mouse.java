package org.HiddenEngine;

import static org.lwjgl.glfw.GLFW.glfwGetCursorPos;
import static org.lwjgl.glfw.GLFW.glfwSetCursor;

import java.nio.DoubleBuffer;

//import static org.lwjgl.glfw.GLFW.glfwGetCursorPos;

public class Mouse {
    public static double GetPosX(long Window, double x, double y) {
       glfwGetCursorPos(Window, x, y);
       Math.floor(x);

       return x;
    }

    public static void SetPos(int x, int y, boolean SetCenter) {
        glfwSetCursor(x, y);
    }
}