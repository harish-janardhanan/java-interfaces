import java.util.Objects;

public class AudiA3 implements ICar{
    private final String modelName;
    private final String modelBrand;
    private final int engineCapacity;

    AudiA3(String modelName, String modelBrand, int engineCapacity){
        this.modelBrand = modelBrand;
        this.modelName = modelName;
        this.engineCapacity = engineCapacity;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public String toString() {
        return "AudiA3{" +
                "modelName='" + modelName + '\'' +
                ", modelBrand='" + modelBrand + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AudiA3 audiA3 = (AudiA3) o;
        return engineCapacity == audiA3.engineCapacity &&
                modelName.equals(audiA3.modelName) &&
                modelBrand.equals(audiA3.modelBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, modelBrand, engineCapacity);
    }

    public String getModelBrand() {
        return modelBrand;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
}
