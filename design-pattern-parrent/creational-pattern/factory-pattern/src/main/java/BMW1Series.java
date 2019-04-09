import java.util.Objects;

public class BMW1Series implements ICar {
    private final String modelName;
    private final String modelBrand;
    private final int engineCapacity;

    BMW1Series(String modelName, String modelBrand, int engineCapacity){
        this.modelBrand = modelBrand;
        this.modelName = modelName;
        this.engineCapacity = engineCapacity;
    }

    public String getModelName() {
        return modelName;
    }

    public String getModelBrand() {
        return modelBrand;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "BMW1Series{" +
                "modelName='" + modelName + '\'' +
                ", modelBrand='" + modelBrand + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BMW1Series that = (BMW1Series) o;
        return engineCapacity == that.engineCapacity &&
                Objects.equals(modelName, that.modelName) &&
                Objects.equals(modelBrand, that.modelBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, modelBrand, engineCapacity);
    }
}
