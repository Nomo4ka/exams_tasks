public enum ImageFormat {
    PNG(".png", false),
    JPEG(".jpeg", true),
    WEBP(".webp", true),
    GIF(".gif", true),
    TIFF(".tiff", false),
    RAW(".raw", false),
    PSD(".psd",false);

    private final String format;
    private final boolean qualityLoss;
    
    ImageFormat(String format, Boolean qualityLoss) {
        this.format = format;
        this.qualityLoss = qualityLoss;
    }

    public String getFormat() {
        return format;
    }

    public Boolean getQualityLoss() {
        return qualityLoss;
    }
}
