package cuongnn68.color.palette.model;

import java.util.Arrays;

public class ImageModel {
    private String id;
    private String name;
    private String imageType;
    private byte[] palette;
    private byte[] data;

    public ImageModel(String id, String name, String imageType, byte[] palette, byte[] data) {
        this.id = id;
        this.name = name;
        this.imageType = imageType;
        this.palette = palette;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public byte[] getPalette() {
        return palette;
    }

    public void setPalette(byte[] palette) {
        this.palette = palette;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ImageModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", imageType='" + imageType + '\'' +
                ", palette=" + Arrays.toString(palette) +
                '}';
    }
}
