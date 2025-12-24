package code.chapter13.myDemo;


/**
 * 产品类：Computer
 */
public class Computer {
    private String cpu;
    private String ram;
    private String graphicsCard;
    private String screen;
    private String keyboard;
    private boolean hasBluetooth;
    private boolean hasWifi;

    // 构造函数私有化，强制客户端使用 Builder 来创建对象
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.graphicsCard = builder.graphicsCard;
        this.screen = builder.screen;
        this.keyboard = builder.keyboard;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasWifi = builder.hasWifi;
    }

    @Override
    public String toString() {
        return "Computer Configurations:\n" +
                "CPU: " + cpu + "\n" +
                "RAM: " + ram + "\n" +
                "Graphics Card: " + graphicsCard + "\n" +
                "Screen: " + screen + "\n" +
                "Keyboard: " + keyboard + "\n" +
                "Bluetooth: " + (hasBluetooth ? "Yes" : "No") + "\n" +
                "WiFi: " + (hasWifi ? "Yes" : "No");
    }

    // --- 静态内部类：Builder ---
    public static class Builder {
        // 必选参数
        private String cpu;
        private String ram;

        // 可选参数（给默认值）
        private String graphicsCard = "Integrated";
        private String screen = "1080P LCD";
        private String keyboard = "Standard";
        private boolean hasBluetooth = false;
        private boolean hasWifi = true;

        // 构造方法：只传入必选参数
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        // 设置可选参数的方法，返回 Builder 本身以支持链式调用
        public Builder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder hasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Builder hasWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        // 核心方法：构建对象
        public Computer build() {
            // 可以在这里加入校验逻辑
            if (this.cpu == null || this.ram == null) {
                throw new IllegalArgumentException("CPU and RAM cannot be null");
            }
            return new Computer(this);
        }
    }
}
