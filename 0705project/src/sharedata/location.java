package sharedata;

// 위치 정보를 가져오는 클래스
public class location {
	public double latitude;
	public double longitude;
	
	public void getLocation() {
		//생성자를 이용한 데이터 전달
		//Map map = new Map(latitude,longitude); // 생성자를 map에서 생성했으니까 여기서 두클래스를 연결 시킴
		
		//setter를 이용한 데이터 전달
		Map map = new Map();
		map.setLatitude(latitude);
		map.setLongitude(longitude);
		
		
		map.showMap();
		
		
		
	}
}
