/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_internalformat_sample_query.txt">NV_internalformat_sample_query</a> extension.
 * 
 * <p>Some OpenGL implementations support modes of multisampling which have properties which are non-obvious to applications and/or which may not be
 * standards conformant. The idea of non-conformant AA modes is not new, and is exposed in both GLX and EGL with config caveats and the
 * GLX_NON_CONFORMANT_CONFIG for GLX and EGL_NON_CONFORMANT_CONFIG for EGL, or by querying the EGL_CONFORMANT attribute in newer versions of EGL.</p>
 * 
 * <p>Both of these mechanisms operate on a per-config basis, which works as intended for window-based configs. However, with the advent of
 * application-created FBOs, it is now possible to do all the multisample operations in an application-created FBO and never use a multisample window.</p>
 * 
 * <p>This extension further extends the internalformat query mechanism (first introduced by ARB_internalformat_query and extended in
 * ARB_internalformat_query2) and introduces a mechanism for a implementation to report properties of formats that may also be dependent on the number of
 * samples. This includes information such as whether the combination of format and samples should be considered conformant. This enables an
 * implementation to report caveats which might apply to both window and FBO-based rendering configurations.</p>
 * 
 * <p>Some NVIDIA drivers support multisample modes which are internally implemented as a combination of multisampling and automatic supersampling in order
 * to obtain a higher level of anti-aliasing than can be directly supported by hardware. This extension allows those properties to be queried by an
 * application with the MULTISAMPLES_NV, SUPERSAMPLE_SCALE_X_NV and SUPERSAMPLE_SCALE_Y_NV properties. For example, a 16xAA mode might be implemented by
 * using 4 samples and up-scaling by a factor of 2 in each of the x- and y-dimensions. In this example, the driver might report MULTSAMPLES_NV of 4,
 * SUPERSAMPLE_SCALE_X_NV of 2, SUPERSAMPLE_SCALE_Y_NV of 2 and CONFORMANT_NV of FALSE.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public class NVInternalformatSampleQuery {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameter of GetInternalformatSampleivNV. */
    public static final int
        GL_MULTISAMPLES_NV        = 0x9371,
        GL_SUPERSAMPLE_SCALE_X_NV = 0x9372,
        GL_SUPERSAMPLE_SCALE_Y_NV = 0x9373,
        GL_CONFORMANT_NV          = 0x9374;

    protected NVInternalformatSampleQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetInternalformatSampleivNV ] ---

    public static native void nglGetInternalformatSampleivNV(int target, int internalformat, int samples, int pname, int bufSize, long params);

    public static void glGetInternalformatSampleivNV(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int samples, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        nglGetInternalformatSampleivNV(target, internalformat, samples, pname, params.remaining(), memAddress(params));
    }

    /** Array version of: {@link #glGetInternalformatSampleivNV GetInternalformatSampleivNV} */
    public static void glGetInternalformatSampleivNV(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int samples, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetInternalformatSampleivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, samples, pname, params.length, params, __functionAddress);
    }

}