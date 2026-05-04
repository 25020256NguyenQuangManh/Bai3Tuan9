import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger log = LoggerFactory.getLogger(MathUtils.class);

    public static int max(int a, int b) {
        log.info("Thuc hien tim max cua {} và {}", a, b);
        if (a >= b) return a;
        return b;
    }

    public static int divide(int a, int b) {
        log.info("Thuc hien phep chia {} cho {}", a, b);
        if (b == 0) {
            log.error("Loi: Nguoi dung co tinh chia cho 0!");
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a / b;
    }
}