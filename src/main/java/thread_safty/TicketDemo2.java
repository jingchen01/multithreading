package thread_safty;

public class TicketDemo2 {

	public static void main(String[] args) {

		int tickets = 100;
		Demo5 d = new Demo5(tickets);

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		Thread t3 = new Thread(d);
		Thread t4 = new Thread(d);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

/*--------------------------------------------------------- * 
 Output:

 Thread-0... sale : ticket#100
 Thread-2... sale : ticket#98
 Thread-3... sale : ticket#97
 Thread-1... sale : ticket#99
 Thread-0... sale : ticket#96
 Thread-1... sale : ticket#93
 Thread-3... sale : ticket#95
 Thread-2... sale : ticket#94
 Thread-0... sale : ticket#92
 Thread-1... sale : ticket#91
 Thread-3... sale : ticket#90
 Thread-2... sale : ticket#89
 Thread-0... sale : ticket#88
 Thread-3... sale : ticket#86
 Thread-1... sale : ticket#85
 Thread-2... sale : ticket#87
 Thread-0... sale : ticket#84
 Thread-3... sale : ticket#83
 Thread-1... sale : ticket#81
 Thread-2... sale : ticket#82
 Thread-0... sale : ticket#80
 Thread-3... sale : ticket#79
 Thread-2... sale : ticket#77
 Thread-1... sale : ticket#78
 Thread-0... sale : ticket#76
 Thread-3... sale : ticket#75
 Thread-2... sale : ticket#73
 Thread-1... sale : ticket#74
 Thread-0... sale : ticket#72
 Thread-3... sale : ticket#71
 Thread-1... sale : ticket#69
 Thread-2... sale : ticket#70
 Thread-0... sale : ticket#68
 Thread-3... sale : ticket#67
 Thread-2... sale : ticket#65
 Thread-1... sale : ticket#66
 Thread-0... sale : ticket#64
 Thread-3... sale : ticket#63
 Thread-1... sale : ticket#62
 Thread-2... sale : ticket#61
 Thread-0... sale : ticket#60
 Thread-3... sale : ticket#59
 Thread-1... sale : ticket#58
 Thread-2... sale : ticket#57
 Thread-0... sale : ticket#56
 Thread-3... sale : ticket#55
 Thread-1... sale : ticket#54
 Thread-2... sale : ticket#53
 Thread-0... sale : ticket#52
 Thread-3... sale : ticket#51
 Thread-2... sale : ticket#49
 Thread-1... sale : ticket#50
 Thread-0... sale : ticket#48
 Thread-3... sale : ticket#47
 Thread-1... sale : ticket#46
 Thread-2... sale : ticket#47
 Thread-0... sale : ticket#45
 Thread-3... sale : ticket#44
 Thread-1... sale : ticket#44
 Thread-2... sale : ticket#44
 Thread-0... sale : ticket#43
 Thread-3... sale : ticket#42
 Thread-2... sale : ticket#40
 Thread-1... sale : ticket#41
 Thread-0... sale : ticket#39
 Thread-3... sale : ticket#38
 Thread-1... sale : ticket#36
 Thread-2... sale : ticket#37
 Thread-0... sale : ticket#35
 Thread-3... sale : ticket#34
 Thread-1... sale : ticket#32
 Thread-2... sale : ticket#33
 Thread-0... sale : ticket#31
 Thread-3... sale : ticket#30
 Thread-2... sale : ticket#29
 Thread-0... sale : ticket#27
 Thread-1... sale : ticket#28
 Thread-3... sale : ticket#26
 Thread-1... sale : ticket#24
 Thread-0... sale : ticket#25
 Thread-2... sale : ticket#23
 Thread-3... sale : ticket#22
 Thread-1... sale : ticket#20
 Thread-2... sale : ticket#21
 Thread-0... sale : ticket#19
 Thread-3... sale : ticket#18
 Thread-0... sale : ticket#15
 Thread-2... sale : ticket#16
 Thread-1... sale : ticket#17
 Thread-3... sale : ticket#14
 Thread-1... sale : ticket#13
 Thread-2... sale : ticket#13
 Thread-0... sale : ticket#14
 Thread-1... sale : ticket#12
 Thread-0... sale : ticket#10
 Thread-2... sale : ticket#11
 Thread-3... sale : ticket#12
 Thread-1... sale : ticket#9
 Thread-2... sale : ticket#6
 Thread-0... sale : ticket#7
 Thread-3... sale : ticket#8
 Thread-2... sale : ticket#5
 Thread-0... sale : ticket#4
 Thread-3... sale : ticket#3
 Thread-1... sale : ticket#2
 Thread-1... sale : ticket#1
 Thread-3... sale : ticket#-2
 Thread-0... sale : ticket#0
 Thread-2... sale : ticket#-1


 ---------------------------------------------------------*/