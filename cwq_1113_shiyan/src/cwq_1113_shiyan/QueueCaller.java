package cwq_1113_shiyan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//排队队列操作问题
public class QueueCaller {

	private ArrayList<String> queue =new ArrayList<String>();
	

	public QueueCaller() {
		super();
	}

	// 尺寸大小
	public int size() {
		return queue.size();
	}

	// 添加排队队列中去
	public void fetchNumber(String patient) {
		queue.add(patient);
		System.out.println(patient + "前面还有 " + (size() - 1) + " 位在等候就诊");
	}

	// 输出患者的姓名
	public void showPatients() {
		Iterator iter = queue.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next() + "候诊中");
		}
	}

	public void callNumber() {
		System.out.println("请患者：" + queue.get(0) + "到诊室就诊");
		queue.remove(0);
	}
}
