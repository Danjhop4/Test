/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Initializes the tinyexr shared library. */
final class LibTinyEXR {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_tinyexr");
        Library.loadSystem(System::load, System::loadLibrary, LibTinyEXR.class, "org.lwjgl.tinyexr", libName);

        MemoryAllocator allocator = getAllocator(Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.get(true));
        setupMalloc(
            allocator.getMalloc(),
            allocator.getCalloc(),
            allocator.getRealloc(),
            allocator.getFree(),
            allocator.getAlignedAlloc(),
            allocator.getAlignedFree()
        );
    }

    private LibTinyEXR() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

    private static native void setupMalloc(
        long malloc,
        long calloc,
        long realloc,
        long free,
        long aligned_alloc,
        long aligned_free
    );

}
