package com.gary.weatherdemo.download.singletask;

import android.os.Environment;
import android.util.Log;

import com.gary.weatherdemo.network.ApiContants;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.io.File;

/**
 * Created by GaryCao on 2019/01/12.
 */
public class XUtilsDownloadImpl implements IDownload {
    private IDownloadListener downloadListener;
    private Callback.Cancelable cancelable;

    @Override
    public void startDownload(String url, IDownloadListener iDownloadListener) {
        downloadListener = iDownloadListener;

        RequestParams params = new RequestParams(url);
        params.setSaveFilePath(Environment.getExternalStorageDirectory() + ApiContants.AMAP_CITY_CONFIG_DIRECTIONARY);
        params.setAutoRename(true);
        params.setCancelFast(true);
        cancelable = x.http().post(params, new Callback.ProgressCallback<File>() {
            @Override
            public void onSuccess(File result) {
                downloadListener.onSuccees();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                downloadListener.onFail();
            }

            @Override
            public void onCancelled(CancelledException cex) {

                downloadListener.onCancel();
            }

            @Override
            public void onFinished() {

            }

            //网络请求之前回调
            @Override
            public void onWaiting() {
            }

            //网络请求开始的时候回调
            @Override
            public void onStarted() {

                downloadListener.onStart();
            }

            @Override
            public void onLoading(long total, long current, boolean isDownloading) {
                downloadListener.onUpdate();
                Log.i("JAVA", "current：" + current + "，total：" + total);
            }
        });
    }

    @Override
    public void pauseDownload() {
        //TODO 如何實現？？
    }

    @Override
    public void cancelDownload() {
        cancelable.cancel();
    }
}
