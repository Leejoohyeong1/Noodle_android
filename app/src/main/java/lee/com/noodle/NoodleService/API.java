package lee.com.noodle.NoodleService;

//public class API extends AsyncTask<Call,Void,Object> {
//
//    @Override
//    protected Object doInBackground(Call... params) {
//        try {
//            Call<ArrayList<NoodleItem>> call = params[0];
//            Response<ArrayList<NoodleItem>> response = call.execute();
//            return response.body().toString();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}

public class API {
    static String BaseURL = "172.30.1.11:3000";
    static String imageBaseURL = "http://www.samyangfoods.com/";
}

