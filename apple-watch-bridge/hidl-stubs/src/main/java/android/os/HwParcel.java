package android.os;

import java.util.ArrayList;

public class HwParcel {
    public static final int STATUS_SUCCESS = 0;

    public HwParcel() {
        throw new RuntimeException("Stub!");
    }

    public final void writeInterfaceToken(String interfaceName) { throw new RuntimeException("Stub!"); }
    public final void enforceInterface(String interfaceName) { throw new RuntimeException("Stub!"); }
    public final void writeStrongBinder(IHwBinder binder) { throw new RuntimeException("Stub!"); }
    public final void writeInt32(int value) { throw new RuntimeException("Stub!"); }
    public final void writeString(String value) { throw new RuntimeException("Stub!"); }
    public final void writeStringVector(ArrayList<String> value) { throw new RuntimeException("Stub!"); }
    public final void writeInt8Vector(ArrayList<Byte> value) { throw new RuntimeException("Stub!"); }
    public final void writeStatus(int status) { throw new RuntimeException("Stub!"); }
    public final int readInt32() { throw new RuntimeException("Stub!"); }
    public final ArrayList<Byte> readInt8Vector() { throw new RuntimeException("Stub!"); }
    public final void verifySuccess() { throw new RuntimeException("Stub!"); }
    public final void releaseTemporaryStorage() { throw new RuntimeException("Stub!"); }
    public final void release() { throw new RuntimeException("Stub!"); }
    public final void send() { throw new RuntimeException("Stub!"); }
}
