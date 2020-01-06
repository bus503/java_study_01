package kr.or.yi.java_study_01.ch05_task;

import java.util.Arrays;

class Dictionary extends PairMap {
    private int length;
    private int size;

	public Dictionary(int size) {
	this.size = size;
	   this.keyArray = new String[size];
	   this.valueArray = new String[size];
	}

	private int findKeyIdx(String key) {
		for(int i=0; i<keyArray.length && keyArray[i] !=null; i++) {
			if(keyArray[i] == key) {
				return i;
			}
				
		}
		return -1;
	}
	@Override
	String get(String key) {
		int getIdx = findKeyIdx(key);
		if (getIdx == -1) {
			return null;
		}
		return this.valueArray[getIdx];
	}

	@Override
	void put(String key, String value) {
       int putIdx= findKeyIdx(key);
       if(putIdx == -1) {
    	   this.keyArray[length] = key;
    	   this.valueArray[length] = value;
    	   length = length +1;
       }
       else {
    	   this.valueArray[putIdx]= value;
       }
	}

	@Override
	String delete(String key) {
		int deleteIdx = findKeyIdx(key);
		if(deleteIdx == -1) {
			System.out.println("삭제할 키가 존재하지 않음");
			return null;
		}
		String value = this.valueArray[deleteIdx];

		
		System.out.println(Arrays.toString(keyArray));//삭제되기 전 확인 
		System.out.println(Arrays.toString(valueArray));
		this.keyArray = reOrder(deleteIdx,keyArray);  //당긴걸 바라보도록.
		
//		String [] tempArray= new String[this.size]; 재활용
	    
		this.valueArray = reOrder(deleteIdx,valueArray);
		
		System.out.println(Arrays.toString(keyArray));//삭제된 후 확인
		System.out.println(Arrays.toString(valueArray));
		
		
		return value;
	}


	private String[] reOrder(int deleteIdx, String[] targetArray) {
		String [] tempArray= new String[this.size];
	    System.arraycopy(targetArray, 0, tempArray, 0, deleteIdx);
		System.arraycopy(targetArray, deleteIdx+1, tempArray, deleteIdx, valueArray.length-deleteIdx-1);

		return tempArray;
	}

	@Override
	int length() {
		// TODO Auto-generated method stub
		return 0;
	}

}
