package q11723;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int M;
	static int[] set = new int[21];

	public static void main(String[] args) throws IOException {
		int i;
		int num;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		M = Integer.parseInt(in.readLine());

		for (i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());

			String op = st.nextToken();
			if (op.equals("all")) {
				Arrays.fill(set, 1);
				continue;
			}
			else if (op.equals("empty")) {
				Arrays.fill(set, 0);
				continue;
			}
			num = Integer.parseInt(st.nextToken());
			
			if (op.equals("add")) set[num] = 1;
			else if (op.equals("remove")) set[num] = 0;
			else if (op.equals("check")) out.write(set[num]+"\n");
			else if (op.equals("toggle")) set[num] = (set[num] + 1) % 2;

		}

		out.flush();

		in.close();
		out.close();
	}
}
