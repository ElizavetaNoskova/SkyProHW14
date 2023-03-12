package transport;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class serviceStation extends PriorityQueue {
    private Queue<Transport<?>> queue;

    public Queue<Transport<?>> getQueue() {
        return queue;
    }
    public serviceStation(){
        this.queue = new LinkedList<>();
    }

    public void addTransport(Transport<?> transports){
        if(transports.getType().equals(Type.BUS)){
            System.out.println("Автобусам не нужно вставать в очередь");
        }
        else {
            queue.offer(transports);
            System.out.println(transports + " встал в очередь на техническое обслуживание");

        }

    }
    public void carryOutMaintenance(){
       while (queue.size()>0){
           System.out.println("Тех осмотр пройден "+ queue.remove());
       }
    }
}
