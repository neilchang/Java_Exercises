import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KMinPairsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = { 1, 2, 4, 5, 6 };
		int nums2[] = { 3, 5, 7, 9 };
		int k = 3;

		List<int[]> list = kSmallestPairs(nums1, nums2, k);

	}

	public static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {

		class Record {
			int sum;
			int[] pair;
		}

		class CompareRecord implements Comparator<Record> {
			public int compare(Record r1, Record r2) {
				return r1.sum - r2.sum;
			}
		}

		int nums1Length = nums1.length;
		int nums2Length = nums2.length;
		int numOfCombinations = nums1Length * nums2Length;
		int nums1_cur = 0, nums2_cur = 0;

		List<int[]> retList = new ArrayList<int[]>();

		if ((nums1Length == 0) || (nums2Length == 0))
			return retList;

		PriorityQueue<Record> pq = new PriorityQueue<Record>(numOfCombinations, new CompareRecord());

		for (int i = 0; i < numOfCombinations; i++) {
			int a = nums1[nums1_cur];
			int b = nums2[nums2_cur];
			int[] pair = { a, b };

			Record r = new Record();
			r.sum = a + b;
			r.pair = pair;

			pq.offer(r);

			nums1_cur++;

			if (nums1_cur == nums1Length) {
				nums2_cur++;
				nums1_cur = 0;
			}
		}

		for (int i = 0; (i < k) && (i < numOfCombinations); i++) {
			Record r = pq.poll();
			retList.add(r.pair);
		}

		return retList;
	}
}