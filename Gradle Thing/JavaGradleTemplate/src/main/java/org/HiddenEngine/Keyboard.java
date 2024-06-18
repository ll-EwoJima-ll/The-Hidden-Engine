package org.HiddenEngine;

import static org.lwjgl.glfw.GLFW.glfwGetKey;

public class Keyboard {
    public void Pressed(long WindowHandle, int Key) {
        int Gk = glfwGetKey(WindowHandle, Key);
        Gk
    }
}