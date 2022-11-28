public class CPU {
    private int Price;

    public CPU() {
        Price = 0;
    }

    public CPU(int price) {
        Price = price;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public class Processor {
        private int cors;
        private String Manufacturer;

        public Processor() {
            cors = 0;
            Manufacturer = null;
        }

        public Processor(int cors, String manufacturer) {
            this.cors = cors;
            Manufacturer = manufacturer;
        }

        public int getCors() {
            return cors;
        }

        public void setCors(int cors) {
            this.cors = cors;
        }

        public String getManufacturer() {
            return Manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            Manufacturer = manufacturer;
        }

        public String getCache() {
            return "Cache of Processor ";
        }

    }

    protected class RAM {
        private int Memory;
        private String Manufacturer;

        public RAM() {
            Memory = 0;
            Manufacturer = null;
        }

        public RAM(int memory, String manufacturer) {
            Memory = memory;
            Manufacturer = manufacturer;
        }

        public int getMemory() {
            return Memory;
        }

        public void setMemory(int memory) {
            Memory = memory;
        }

        public String getManufacturer() {
            return Manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            Manufacturer = manufacturer;
        }


        public int getLockSpeed() {
            return 64;
        }
    }
}
