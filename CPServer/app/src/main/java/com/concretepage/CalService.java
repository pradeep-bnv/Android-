package com.concretepage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class CalService extends Service {
	@Override
	public IBinder onBind(Intent arg0) {
		return binder;
	}
	private final ICalService.Stub binder = new ICalService.Stub() {
		@Override
		public int getResult(int val1, int val2) throws RemoteException {
			return val1 * val2;
		}
		@Override
		public String getMessage(String name) throws RemoteException {
			return "Hello "+ name+", Result is:";
		}
	};
}
