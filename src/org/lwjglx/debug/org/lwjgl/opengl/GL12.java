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
package org.lwjglx.debug.org.lwjgl.opengl;

import static org.lwjglx.debug.RT.*;
import static org.lwjglx.debug.org.lwjgl.opengl.Context.*;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

import org.lwjglx.debug.GLmetadata;
import org.lwjglx.debug.MethodCall;
import org.lwjglx.debug.Properties;
import org.lwjglx.debug.RT;

public class GL12 {

    public static void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
        if (Properties.VALIDATE.enabled) {
            int ibo = org.lwjgl.opengl.GL11.glGetInteger(org.lwjgl.opengl.GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING);
            if (ibo == 0) {
                throwISEOrLogError("glDrawRangeElements called with index offset but no ELEMENT_ARRAY_BUFFER bound");
            }
            checkBeforeDrawCall();
        }
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, count, type, indices);
        RT.draw(count);
    }

    public static void glDrawRangeElements(int mode, int start, int end, int type, ByteBuffer indices) {
        if (Properties.VALIDATE.enabled) {
            checkBeforeDrawCall();
        }
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, type, indices);
        RT.draw(indices.remaining());
    }

    public static void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices) {
        if (Properties.VALIDATE.enabled) {
            checkBeforeDrawCall();
        }
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices);
        RT.draw(indices.remaining());
    }

    public static void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices) {
        if (Properties.VALIDATE.enabled) {
            checkBeforeDrawCall();
        }
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices);
        RT.draw(indices.remaining());
    }

    public static void glDrawRangeElements(int mode, int start, int end, IntBuffer indices) {
        if (Properties.VALIDATE.enabled) {
            checkBeforeDrawCall();
        }
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices);
        RT.draw(indices.remaining());
    }

    private static void glTexImage3D_trace(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, Buffer pixels, MethodCall mc) {
        mc.paramEnum(GLmetadata.TextureTarget().get(target));
        mc.param(level);
        if (internalformat >= 1 && internalformat <= 4)
            mc.param(internalformat);
        else
            mc.paramEnum(RT.glEnumFor(internalformat, GLmetadata.InternalFormat()));
        mc.param(width);
        mc.param(height);
        mc.param(depth);
        mc.param(border);
        mc.paramEnum(RT.glEnumFor(format, GLmetadata.PixelFormat()));
        mc.paramEnum(RT.glEnumFor(type, GLmetadata.PixelType()));
        mc.param(pixels);
    }

    public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels, Void ret, MethodCall mc) {
        glTexImage3D_trace(target, level, internalformat, width, height, depth, border, format, type, pixels, mc);
    }

    public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels, Void ret, MethodCall mc) {
        glTexImage3D_trace(target, level, internalformat, width, height, depth, border, format, type, pixels, mc);
    }

    public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels, Void ret, MethodCall mc) {
        glTexImage3D_trace(target, level, internalformat, width, height, depth, border, format, type, pixels, mc);
    }

    public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels, Void ret, MethodCall mc) {
        glTexImage3D_trace(target, level, internalformat, width, height, depth, border, format, type, pixels, mc);
    }

    public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels, Void ret, MethodCall mc) {
        glTexImage3D_trace(target, level, internalformat, width, height, depth, border, format, type, pixels, mc);
    }

}
