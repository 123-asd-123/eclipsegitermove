package cwq_1113_shiyan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//�ŶӶ��в�������
public class QueueCaller {

	private ArrayList<String> queue =new ArrayList<String>();
	

	public QueueCaller() {
		super();
	}

	// �ߴ��С
	public int size() {
		return queue.size();
	}

	// ����ŶӶ�����ȥ
	public void fetchNumber(String patient) {
		queue.add(patient);
		System.out.println(patient + "ǰ�滹�� " + (size() - 1) + " λ�ڵȺ����");
	}

	// ������ߵ�����
	public void showPatients() {
		Iterator iter = queue.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next() + "������");
		}
	}

	public void callNumber() {
		System.out.println("�뻼�ߣ�" + queue.get(0) + "�����Ҿ���");
		queue.remove(0);
	}
}
