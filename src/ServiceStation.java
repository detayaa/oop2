import transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <L extends Transport> {
    private final Queue<L> queue = new LinkedList<>();

    public void addCar(L transport) {
        queue.offer(transport);
    }

    public void service() {
        L transport = queue.poll();
        if (transport != null) {
            System.out.println("Проводится техосмотр " + transport.getBrand());
            service();
        } else {
            System.out.println("Машин больше нет");
        }
    }
}
