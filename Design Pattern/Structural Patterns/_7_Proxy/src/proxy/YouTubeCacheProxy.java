package proxy;

import some_cool_media_library.ThirdPartyYouTubeClass;
import some_cool_media_library.ThirdPartyYouTubeLib;
import some_cool_media_library.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youTubeService;
    private HashMap<String, Video> cachePopulat = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youTubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopulat.isEmpty()) {
            cachePopulat = youTubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopulat;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null){
            video = youTubeService.getVideo(videoId);
            cacheAll.put(videoId,video);
        }else {
            System.out.println("Retrieved video " + videoId + "from cache");
        }
        return video;
    }

    public void reset(){
        cachePopulat.clear();
        cacheAll.clear();
    }
}
