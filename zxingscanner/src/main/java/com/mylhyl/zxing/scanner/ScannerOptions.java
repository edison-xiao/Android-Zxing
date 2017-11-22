package com.mylhyl.zxing.scanner;

import android.graphics.Color;

import com.google.zxing.BarcodeFormat;
import com.mylhyl.zxing.scanner.camera.open.CameraFacing;
import com.mylhyl.zxing.scanner.common.Scanner;
import com.mylhyl.zxing.scanner.decode.DecodeFormatManager;

import java.util.Collection;

/**
 * Created by hupei on 2017/11/21.
 */

public final class ScannerOptions {

    public static final int DEFAULT_LASER_LINE_HEIGHT = 2;//扫描线默认高度

    private int laserLineColor = Scanner.color.VIEWFINDER_LASER;//扫描线颜色rgb值
    private int laserLineResId;//扫描线资源文件
    private boolean isLaserGridLine;//扫描线资源文件是否为网格样式
    private int laserLineHeight = DEFAULT_LASER_LINE_HEIGHT;//扫描线高度，网络样式无效，单位dp
    private int laserLineMoveSpeed = 6;//扫描线移动间距，默认每毫秒移动6px，单位px
    private int laserFrameWidth;//扫描框的宽度，单位dp
    private int laserFrameHeight;//扫描框的高度，单位dp
    private int laserFrameCornerColor = laserLineColor;//扫描框4角颜色rgb值
    private int laserFrameCornerLength = 15;//扫描框4角长度，单位dp 默认15
    private int laserFrameCornerWidth = 2;//扫描框4角宽度，单位dp 默认2
    private int laserFrameTopMargin;//扫描框与顶部间距，单位dp，默认居中
    private boolean isLaserFrameHide;//是否隐藏扫描框，默认显示
    private boolean isViewfinderHide;//是否隐藏整个取景视图，包括文字，默认显示
    private String tipText = "将二维码放入框内，即可自动扫描";//提示文字
    private int tipTextColor = Color.WHITE;//提示文字颜色rgb值，默认白色
    private int tipTextSize = 15;//提交文字大小，单位sp 默认15
    private boolean isTipTextLaserFrameBottom = true;//是否在扫描框下方，默认下方
    private int tipTextLaserFrameMargin = 20;//离扫描框间距，单位dp 默认20
    private int mediaResId;//扫描成功音频资源文件
    private Collection<BarcodeFormat> decodeFormats;//解码类型，默认解全部
    private boolean isCreateQrThumbnail;//生成扫描结果缩略图，默认不生成
    private CameraFacing cameraFacing = CameraFacing.BACK;//启动摄像头位置，默认后置
    private boolean isScanFullScreen;//是否全屏扫描识别，默认扫描框内识别
    private boolean isScanInvert;//是否扫描反色二维码（用于黑底白码）

    protected ScannerOptions() {
    }

    public int getLaserLineColor() {
        return laserLineColor;
    }

    public int getLaserLineResId() {
        return laserLineResId;
    }

    public boolean isLaserGridLine() {
        return isLaserGridLine;
    }

    public int getLaserLineHeight() {
        return laserLineHeight;
    }

    public int getLaserLineMoveSpeed() {
        return laserLineMoveSpeed;
    }

    public int getLaserFrameWidth() {
        return laserFrameWidth;
    }

    public int getLaserFrameHeight() {
        return laserFrameHeight;
    }

    public int getLaserFrameCornerColor() {
        return laserFrameCornerColor;
    }

    public int getLaserFrameCornerLength() {
        return laserFrameCornerLength;
    }

    public int getLaserFrameCornerWidth() {
        return laserFrameCornerWidth;
    }

    public int getLaserFrameTopMargin() {
        return laserFrameTopMargin;
    }

    public boolean isLaserFrameHide() {
        return isLaserFrameHide;
    }

    public boolean isViewfinderHide() {
        return isViewfinderHide;
    }

    public String getTipText() {
        return tipText;
    }

    public int getTipTextColor() {
        return tipTextColor;
    }

    public int getTipTextSize() {
        return tipTextSize;
    }

    public boolean isTipTextLaserFrameBottom() {
        return isTipTextLaserFrameBottom;
    }

    public int getTipTextLaserFrameMargin() {
        return tipTextLaserFrameMargin;
    }

    public int getMediaResId() {
        return mediaResId;
    }

    public Collection<BarcodeFormat> getDecodeFormats() {
        return decodeFormats;
    }

    public boolean isCreateQrThumbnail() {
        return isCreateQrThumbnail;
    }

    public CameraFacing getCameraFacing() {
        return cameraFacing;
    }

    public boolean isScanFullScreen() {
        return isScanFullScreen;
    }

    public boolean isScanInvert() {
        return isScanInvert;
    }

    public static final class Builder {
        private ScannerOptions options;

        public Builder() {
            options = new ScannerOptions();
        }

        public ScannerOptions build() {
            return options;
        }

        /**
         * 设置扫描线颜色值
         *
         * @param color rgb
         */
        public Builder setLaserLineColor(int color) {
            options.laserLineColor = color;
            return this;
        }

        /**
         * 设置线形扫描线资源
         *
         * @param resId resId
         */
        public Builder setLaserLineResId(int resId) {
            options.laserLineResId = resId;
            options.isLaserGridLine = false;
            return this;
        }

        /**
         * 设置网格扫描线资源
         *
         * @param resId resId
         */
        public Builder setLaserGridLineResId(int resId) {
            options.laserLineResId = resId;
            options.isLaserGridLine = true;
            return this;
        }

        /**
         * 设置扫描线高度
         *
         * @param height dp
         */
        public Builder setLaserLineHeight(int height) {
            options.laserLineHeight = height;
            return this;
        }

        /**
         * 设置扫描框4角颜色值
         *
         * @param color rgb
         */
        public Builder setLaserFrameCornerColor(int color) {
            options.laserFrameCornerColor = color;
            return this;
        }

        /**
         * 设置扫描框4角长度
         *
         * @param length dp
         */
        public Builder setLaserFrameCornerLength(int length) {
            options.laserFrameCornerLength = length;
            return this;
        }

        /**
         * 设置扫描框4角宽度
         *
         * @param width dp
         */
        public Builder setLaserFrameCornerWidth(int width) {
            options.laserFrameCornerWidth = width;
            return this;
        }

        /**
         * 设置文字
         *
         * @param text 文字
         */
        public Builder setTipText(String text) {
            options.tipText = text;
            return this;
        }

        /**
         * 设置文字颜色
         *
         * @param color 文字颜色
         */
        public Builder setTipTextColor(int color) {
            options.tipTextColor = color;
            return this;
        }

        /**
         * 设置文字大小
         *
         * @param size 文字大小 sp
         */
        public Builder setTipTextSize(int size) {
            options.tipTextSize = size;
            return this;
        }

        /**
         * 设置文字与扫描框间距
         *
         * @param margin 间距 单位dp
         */
        public Builder setTipTextLaserFrameMargin(int margin) {
            options.tipTextLaserFrameMargin = margin;
            return this;
        }

        /**
         * 设置文字是否在扫描框下方，默认下方
         *
         * @param bottom true=下方，false=上方
         */
        public Builder setTipTextLaserFrameBottom(boolean bottom) {
            options.isTipTextLaserFrameBottom = bottom;
            return this;
        }

        /**
         * 设置扫描成功的音频
         *
         * @param resId
         */
        public Builder setMediaResId(int resId) {
            options.mediaResId = resId;
            return this;
        }

        /**
         * 设置扫描框大小
         *
         * @param width  dp
         * @param height dp
         */
        public Builder setLaserFrameSize(int width, int height) {
            options.laserFrameWidth = width;
            options.laserFrameHeight = height;
            return this;
        }

        /**
         * 设置扫描框与屏幕顶部距离
         *
         * @param margin dp
         */
        public Builder setLaserFrameTopMargin(int margin) {
            options.laserFrameTopMargin = margin;
            return this;
        }

        /**
         * 是否隐藏扫描框
         *
         * @param hide
         * @return
         */
        public Builder setLaserFrameHide(boolean hide) {
            options.isLaserFrameHide = hide;
            return this;
        }

        /**
         * 设置扫描解码类型（二维码、一维码、商品条码）
         *
         * @param scanMode {@linkplain Scanner.ScanMode mode}
         * @return
         */
        public Builder setScanMode(String scanMode) {
            options.decodeFormats = DecodeFormatManager.parseDecodeFormats(scanMode);
            return this;
        }

        /**
         * 设置扫描解码类型
         *
         * @param barcodeFormat
         * @return
         */
        public Builder setScanMode(BarcodeFormat... barcodeFormat) {
            options.decodeFormats = DecodeFormatManager.parseDecodeFormats(barcodeFormat);
            return this;
        }

        /**
         * 是否创建扫描结果缩略图
         *
         * @param thumbnail
         * @return
         */
        public Builder setCreateQrThumbnail(boolean thumbnail) {
            options.isCreateQrThumbnail = thumbnail;
            return this;
        }

        /**
         * 设置扫描框线移动间距
         *
         * @param moveSpeed 每毫秒移动 moveSpeed 像素 px
         * @return
         */
        public Builder setLaserMoveSpeed(int moveSpeed) {
            options.laserLineMoveSpeed = moveSpeed;
            return this;
        }

        /**
         * 设置扫描摄像头，默认后置
         *
         * @param cameraFacing
         * @return
         */
        public Builder setCameraFacing(CameraFacing cameraFacing) {
            options.cameraFacing = cameraFacing;
            return this;
        }

        /**
         * 是否全屏扫描
         *
         * @param scanFullScreen
         * @return
         */
        public Builder setScanFullScreen(boolean scanFullScreen) {
            options.isScanFullScreen = scanFullScreen;
            return this;
        }

        /**
         * 设置隐藏取景视图，包括文字
         *
         * @param hide
         * @return
         */
        public Builder setViewfinderHide(boolean hide) {
            options.isViewfinderHide = hide;
            return this;
        }

        /**
         * 是否扫描反色二维码（黑底白码）
         *
         * @param invertScan
         * @return
         */
        public Builder setScanInvert(boolean invertScan) {
            options.isScanInvert = invertScan;
            return this;
        }
    }
}
