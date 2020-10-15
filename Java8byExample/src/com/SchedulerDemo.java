import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
public class SchedulerDemo {

	@Scheduled(fixedDelay = 2000)
	public void scheduleTask() {
		System.out.println("Schedulter will run after every 2 secs delay ");
	}
	
}
