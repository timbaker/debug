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

import org.lwjglx.debug.*;

public class GL11 {

    public static void glClear(int mask) {
        if (Properties.VALIDATE.enabled) {
            checkFramebufferCompleteness();
        }
        org.lwjgl.opengl.GL11.glClear(mask);
    }

    public static void glEnableClientState(int cap) {
        if (Properties.VALIDATE.enabled) {
            switch (cap) {
            case org.lwjgl.opengl.GL11.GL_VERTEX_ARRAY:
                Context.currentContext().currentVao.vertexArrayEnabled = true;
                break;
            case org.lwjgl.opengl.GL11.GL_NORMAL_ARRAY:
                Context.currentContext().currentVao.normalArrayEnabled = true;
                break;
            case org.lwjgl.opengl.GL11.GL_COLOR_ARRAY:
                Context.currentContext().currentVao.colorArrayEnabled = true;
                break;
            case org.lwjgl.opengl.GL11.GL_TEXTURE_COORD_ARRAY:
                Context.currentContext().currentVao.texCoordArrayEnabled = true;
                break;
            }
        }
        org.lwjgl.opengl.GL11.glEnableClientState(cap);
    }

    public static void glDisableClientState(int cap) {
        if (Properties.VALIDATE.enabled) {
            switch (cap) {
            case org.lwjgl.opengl.GL11.GL_VERTEX_ARRAY:
                Context.currentContext().currentVao.vertexArrayEnabled = false;
                break;
            case org.lwjgl.opengl.GL11.GL_NORMAL_ARRAY:
                Context.currentContext().currentVao.normalArrayEnabled = false;
                break;
            case org.lwjgl.opengl.GL11.GL_COLOR_ARRAY:
                Context.currentContext().currentVao.colorArrayEnabled = false;
                break;
            case org.lwjgl.opengl.GL11.GL_TEXTURE_COORD_ARRAY:
                Context.currentContext().currentVao.texCoordArrayEnabled = false;
                break;
            }
        }
        org.lwjgl.opengl.GL11.glDisableClientState(cap);
    }

    public static void glVertexPointer(int size, int type, int stride, ByteBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.vertexArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    public static void glVertexPointer(int size, int type, int stride, long pointer) {
        if (Properties.VALIDATE.enabled) {
            int vbo = org.lwjgl.opengl.GL11.glGetInteger(org.lwjgl.opengl.GL15.GL_ARRAY_BUFFER_BINDING);
            if (vbo != 0) {
                Context.currentContext().currentVao.vertexArrayInitialized = true;
            }
        }
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    public static void glVertexPointer(int size, int type, int stride, ShortBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.vertexArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    public static void glVertexPointer(int size, int type, int stride, IntBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.vertexArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    public static void glVertexPointer(int size, int type, int stride, FloatBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.vertexArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    public static void glNormalPointer(int type, int stride, ByteBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.vertexArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    public static void glNormalPointer(int type, int stride, long pointer) {
        if (Properties.VALIDATE.enabled) {
            int vbo = org.lwjgl.opengl.GL11.glGetInteger(org.lwjgl.opengl.GL15.GL_ARRAY_BUFFER_BINDING);
            if (vbo != 0) {
                Context.currentContext().currentVao.normalArrayInitialized = true;
            }
        }
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    public static void glNormalPointer(int type, int stride, ShortBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.normalArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    public static void glNormalPointer(int type, int stride, IntBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.normalArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    public static void glNormalPointer(int type, int stride, FloatBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.normalArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    public static void glColorPointer(int size, int type, int stride, ByteBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.normalArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    public static void glColorPointer(int size, int type, int stride, long pointer) {
        if (Properties.VALIDATE.enabled) {
            int vbo = org.lwjgl.opengl.GL11.glGetInteger(org.lwjgl.opengl.GL15.GL_ARRAY_BUFFER_BINDING);
            if (vbo != 0) {
                Context.currentContext().currentVao.colorArrayInitialized = true;
            }
        }
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    public static void glColorPointer(int size, int type, int stride, ShortBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.colorArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    public static void glColorPointer(int size, int type, int stride, IntBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.colorArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    public static void glColorPointer(int size, int type, int stride, FloatBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.colorArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    public static void glTexCoordPointer(int size, int type, int stride, ByteBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.texCoordArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    public static void glTexCoordPointer(int size, int type, int stride, long pointer) {
        if (Properties.VALIDATE.enabled) {
            int vbo = org.lwjgl.opengl.GL11.glGetInteger(org.lwjgl.opengl.GL15.GL_ARRAY_BUFFER_BINDING);
            if (vbo != 0) {
                Context.currentContext().currentVao.texCoordArrayInitialized = true;
            }
        }
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    public static void glTexCoordPointer(int size, int type, int stride, ShortBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.texCoordArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    public static void glTexCoordPointer(int size, int type, int stride, IntBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.texCoordArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    public static void glTexCoordPointer(int size, int type, int stride, FloatBuffer pointer) {
        if (Properties.VALIDATE.enabled) {
            Context.currentContext().currentVao.texCoordArrayInitialized = pointer != null;
        }
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    public static void glDrawArrays(int mode, int first, int count) {
        if (Properties.VALIDATE.enabled) {
            checkBeforeDrawCall();
        }
        org.lwjgl.opengl.GL11.glDrawArrays(mode, first, count);
        RT.draw(count);
    }

    public static void nglDrawElements(int mode, int count, int type, long indices) {
        if (Properties.VALIDATE.enabled) {
            int ibo = org.lwjgl.opengl.GL11.glGetInteger(org.lwjgl.opengl.GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING);
            if (ibo == 0 && isInvalidPointer(indices)) {
                throwISEOrLogError("glDrawElements called with invalid pointer or index index offset but no ELEMENT_ARRAY_BUFFER bound");
            }
            checkBeforeDrawCall();
        }
        org.lwjgl.opengl.GL11.nglDrawElements(mode, count, type, indices);
        RT.draw(count);
    }

    public static void glDrawElements(int mode, int count, int type, long indices) {
		nglDrawElements(mode, count, type, indices);
    }

    public static void glDrawElements(int mode, int type, ByteBuffer indices) {
        if (Properties.VALIDATE.enabled) {
            checkBeforeDrawCall();
        }
        org.lwjgl.opengl.GL11.glDrawElements(mode, type, indices);
        RT.draw(indices.remaining());
    }

    public static void glDrawElements(int mode, ByteBuffer indices) {
        if (Properties.VALIDATE.enabled) {
            checkBeforeDrawCall();
        }
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices);
        RT.draw(indices.remaining());
    }

    public static void glDrawElements(int mode, ShortBuffer indices) {
        if (Properties.VALIDATE.enabled) {
            checkBeforeDrawCall();
        }
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices);
        RT.draw(indices.remaining());
    }

    public static void glDrawElements(int mode, IntBuffer indices) {
        if (Properties.VALIDATE.enabled) {
            checkBeforeDrawCall();
        }
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices);
        RT.draw(indices.remaining());
    }

    public static void glPopClientAttrib() {
        org.lwjgl.opengl.GL11.glPopClientAttrib();
        /* Refresh vertex array state */
        Context context = Context.currentContext();
        for (int i = 0; i < context.GL_MAX_VERTEX_ATTRIBS; i++) {
            /* Read enable state and buffer bindings */
            if (context.caps.OpenGL20) {
                context.currentVao.enabledVertexArrays[i] = org.lwjgl.opengl.GL20.glGetVertexAttribi(i, org.lwjgl.opengl.GL20.GL_VERTEX_ATTRIB_ARRAY_ENABLED) == 1;
                context.currentVao.initializedVertexArrays[i] = org.lwjgl.opengl.GL20.glGetVertexAttribi(i, org.lwjgl.opengl.GL15.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING) != 0;
            } else if (context.caps.GL_ARB_vertex_shader) {
                context.currentVao.enabledVertexArrays[i] = org.lwjgl.opengl.ARBVertexShader.glGetVertexAttribiARB(i, org.lwjgl.opengl.ARBVertexShader.GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB) == 1;
                context.currentVao.initializedVertexArrays[i] = org.lwjgl.opengl.GL20.glGetVertexAttribi(i, org.lwjgl.opengl.ARBVertexBufferObject.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB) != 0;
            }
        }
    }

    public static void glGenTextures(IntBuffer textures) {
        org.lwjgl.opengl.GL11.glGenTextures(textures);
        Context ctx = Context.currentContext();
        int pos = textures.position();
        for (int i = 0; i < textures.remaining(); i++) {
            int texture = textures.get(pos + i);
            ctx.shareGroup.textureObjects.put(texture, new TextureObject());
        }
    }

    public static void glGenTextures(int[] textures) {
        org.lwjgl.opengl.GL11.glGenTextures(textures);
        Context ctx = Context.currentContext();
        for (int i = 0; i < textures.length; i++) {
            int texture = textures[i];
            ctx.shareGroup.textureObjects.put(texture, new TextureObject());
        }
    }

    public static int glGenTextures() {
        int tex = org.lwjgl.opengl.GL11.glGenTextures();
        Context ctx = Context.currentContext();
        ctx.shareGroup.textureObjects.put(tex, new TextureObject());
        return tex;
    }

    private static void glTexImage2D_trace(int target, int level, int internalformat, int width, int height, int border, int format, int type, Object pixelsOrSize, MethodCall mc) {
        mc.paramEnum(GLmetadata.TextureTarget().get(target));
        mc.param(level);
        if (internalformat >= 1 && internalformat <= 4)
            mc.param(internalformat);
        else
            mc.paramEnum(RT.glEnumFor(internalformat, GLmetadata.InternalFormat()));
        mc.param(width);
        mc.param(height);
        mc.param(border);
        mc.paramEnum(RT.glEnumFor(format, GLmetadata.PixelFormat()));
        mc.paramEnum(RT.glEnumFor(type, GLmetadata.PixelType()));
        mc.param(pixelsOrSize);
    }

    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long size, Void ret, MethodCall mc) {
        glTexImage2D_trace(target, level, internalformat, width, height, border, format, type, size, mc);
    }

    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels, Void ret, MethodCall mc) {
        glTexImage2D_trace(target, level, internalformat, width, height, border, format, type, pixels, mc);
    }

    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels, Void ret, MethodCall mc) {
        glTexImage2D_trace(target, level, internalformat, width, height, border, format, type, pixels, mc);
    }

    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels, Void ret, MethodCall mc) {
        glTexImage2D_trace(target, level, internalformat, width, height, border, format, type, pixels, mc);
    }

    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels, Void ret, MethodCall mc) {
        glTexImage2D_trace(target, level, internalformat, width, height, border, format, type, pixels, mc);
    }

    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels, Void ret, MethodCall mc) {
        glTexImage2D_trace(target, level, internalformat, width, height, border, format, type, pixels, mc);
    }

    private static void glTexImage1D_trace(int target, int level, int internalformat, int width, int border, int format, int type, Buffer pixels, MethodCall mc) {
        mc.paramEnum(GLmetadata.TextureTarget().get(target));
        mc.param(level);
        if (internalformat >= 1 && internalformat <= 4)
            mc.param(internalformat);
        else
            mc.paramEnum(RT.glEnumFor(internalformat, GLmetadata.InternalFormat()));
        mc.param(width);
        mc.param(border);
        mc.paramEnum(RT.glEnumFor(format, GLmetadata.PixelFormat()));
        mc.paramEnum(RT.glEnumFor(type, GLmetadata.PixelType()));
        mc.param(pixels);
    }

    public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels, Void ret, MethodCall mc) {
        glTexImage1D_trace(target, level, internalformat, width, border, format, type, pixels, mc);
    }

    public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels, Void ret, MethodCall mc) {
        glTexImage1D_trace(target, level, internalformat, width, border, format, type, pixels, mc);
    }

    public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels, Void ret, MethodCall mc) {
        glTexImage1D_trace(target, level, internalformat, width, border, format, type, pixels, mc);
    }

    public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels, Void ret, MethodCall mc) {
        glTexImage1D_trace(target, level, internalformat, width, border, format, type, pixels, mc);
    }

    public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels, Void ret, MethodCall mc) {
        glTexImage1D_trace(target, level, internalformat, width, border, format, type, pixels, mc);
    }

    private static void glTexParameter_trace(int target, int pname, int param, MethodCall mc) {
        switch (pname) {
        case org.lwjgl.opengl.GL43.GL_DEPTH_STENCIL_TEXTURE_MODE:
            mc.paramEnum(RT.glEnumFor(param, GLmetadata.PixelFormat()));
            break;
        case org.lwjgl.opengl.GL11.GL_TEXTURE_MIN_FILTER:
            mc.paramEnum(RT.glEnumFor(param, GLmetadata.TextureMinFilter()));
            break;
        case org.lwjgl.opengl.GL11.GL_TEXTURE_MAG_FILTER:
            mc.paramEnum(RT.glEnumFor(param, GLmetadata.TextureMagFilter()));
            break;
        case org.lwjgl.opengl.GL14.GL_TEXTURE_COMPARE_FUNC:
            mc.paramEnum(RT.glEnumFor(param, GLmetadata.AlphaFunction()));
            break;
        case org.lwjgl.opengl.GL14.GL_TEXTURE_COMPARE_MODE:
            mc.paramEnum(GLmetadata._null_().get(param));
            break;
        case org.lwjgl.opengl.GL11.GL_TEXTURE_WRAP_S:
            mc.paramEnum(RT.glEnumFor(param, GLmetadata.TextureWrapMode()));
            break;
        case org.lwjgl.opengl.GL11.GL_TEXTURE_WRAP_T:
            mc.paramEnum(RT.glEnumFor(param, GLmetadata.TextureWrapMode()));
            break;
        case org.lwjgl.opengl.GL12.GL_TEXTURE_WRAP_R:
            mc.paramEnum(RT.glEnumFor(param, GLmetadata.TextureWrapMode()));
            break;
        case org.lwjgl.opengl.GL14.GL_GENERATE_MIPMAP:
            mc.paramEnum(GLmetadata.Boolean().get(param));
            break;
        default:
            mc.param(param);
            break;
        }
    }

    public static void glTexParameteri(int target, int pname, int param, Void ret, MethodCall mc) {
        mc.paramEnum(RT.glEnumFor(target, GLmetadata.TextureTarget()));
        mc.paramEnum(RT.glEnumFor(pname, GLmetadata.TextureParameterName()));
        glTexParameter_trace(target, pname, param, mc);
    }

    public static void glBegin(int mode) {
        RT.beginImmediate();
        org.lwjgl.opengl.GL11.glBegin(mode);
    }

    public static void glEnd() {
        org.lwjgl.opengl.GL11.glEnd();
        RT.endImmediate();
    }

}
