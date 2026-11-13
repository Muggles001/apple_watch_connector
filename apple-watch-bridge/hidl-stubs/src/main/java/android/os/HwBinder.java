package android.os;

import java.util.NoSuchElementException;

public abstract class HwBinder implements IHwBinder {
    public HwBinder() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public final void transact(int code, HwParcel request, HwParcel reply, int flags)
            throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public abstract void onTransact(int code, HwParcel request, HwParcel reply, int flags)
            throws RemoteException;

    @Override
    public final boolean linkToDeath(DeathRecipient recipient, long cookie) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public final boolean unlinkToDeath(DeathRecipient recipient) {
        throw new RuntimeException("Stub!");
    }

    public static final IHwBinder getService(String iface, String serviceName)
            throws RemoteException, NoSuchElementException {
        throw new RuntimeException("Stub!");
    }

    public static final void configureRpcThreadpool(long maxThreads, boolean callerWillJoin) {
        throw new RuntimeException("Stub!");
    }

    public static final void joinRpcThreadpool() {
        throw new RuntimeException("Stub!");
    }
}
