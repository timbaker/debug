/*
 * (C) Copyright 2017 Kai Burjack

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.

 */
package org.lwjglx.debug.opengl;

import java.nio.IntBuffer;

import org.lwjglx.debug.Properties;
import org.lwjglx.debug.opengl.Context.VAO;

public class ARBDirectStateAccess {

    public static void glCreateVertexArrays(IntBuffer arrays) {
        org.lwjgl.opengl.ARBDirectStateAccess.glCreateVertexArrays(arrays);
        if (Properties.VALIDATE.enabled) {
            Context context = Context.currentContext();
            int position = arrays.position();
            for (int i = 0; i < arrays.remaining(); i++) {
                VAO vao = new VAO(context.GL_MAX_VERTEX_ATTRIBS);
                context.vaos.put(arrays.get(position + i), vao);
            }
        }
    }

    public static int glCreateVertexArrays() {
        int index = org.lwjgl.opengl.ARBDirectStateAccess.glCreateVertexArrays();
        if (Properties.VALIDATE.enabled) {
            Context context = Context.currentContext();
            VAO vao = new VAO(context.GL_MAX_VERTEX_ATTRIBS);
            context.vaos.put(index, vao);
        }
        return index;
    }

    public static void glDisableVertexArrayAttrib(int vaobj, int index) {
        org.lwjgl.opengl.ARBDirectStateAccess.glDisableVertexArrayAttrib(vaobj, index);
        if (Properties.VALIDATE.enabled) {
            Context context = Context.currentContext();
            context.vaos.get(vaobj).enabledVertexArrays[index] = false;
        }
    }

    public static void glEnableVertexArrayAttrib(int vaobj, int index) {
        org.lwjgl.opengl.ARBDirectStateAccess.glDisableVertexArrayAttrib(vaobj, index);
        if (Properties.VALIDATE.enabled) {
            Context context = Context.currentContext();
            context.vaos.get(vaobj).enabledVertexArrays[index] = true;
        }
    }

}
