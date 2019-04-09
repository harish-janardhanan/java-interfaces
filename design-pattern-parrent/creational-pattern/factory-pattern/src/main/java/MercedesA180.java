import java.util.Objects;

public class MercedesA180 implements ICar{

        private final String modelName;
        private final String modelBrand;
        private final int engineCapacity;

        MercedesA180(String modelName, String modelBrand, int engineCapacity){
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
        return "MercedesA180{" +
                "modelName='" + modelName + '\'' +
                ", modelBrand='" + modelBrand + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MercedesA180 that = (MercedesA180) o;
        return engineCapacity == that.engineCapacity &&
                modelName.equals(that.modelName) &&
                modelBrand.equals(that.modelBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, modelBrand, engineCapacity);
    }
}
