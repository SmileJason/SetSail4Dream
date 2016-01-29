package com.weijie.setsail4dream.bean;

import java.util.List;

/**
 * Created by webdev on 2016/1/28.
 */
public class Location {

    private String status;

    private ResultEntity data;

    public static class ResultEntity {

        private String province;

        private List<Cross> cross_list;

        private String code;

        private String tel;

        private String cityadcode;

        private String areacode;

        private String timestamp;

        private String pos;

        private List<Road> road_list;

        private String result;

        private String message;

        private String desc;

        private String city;

        private String districtadcode;

        private String district;

        private String country;

        private String provinceadcode;

        private String version;

        private String adcode;

        private List<Poi> poi_list;

        public static class Cross {

            private String distance;

            private String direction;

            private String name;

            private String weight;

            private String level;

            private String longitude;

            private String crossid;

            private String width;

            private String latitude;

            public String getDistance() {
                return distance;
            }

            public String getDirection() {
                return direction;
            }

            public String getName() {
                return name;
            }

            public String getWeight() {
                return weight;
            }

            public String getLevel() {
                return level;
            }

            public String getLongitude() {
                return longitude;
            }

            public String getCrossid() {
                return crossid;
            }

            public String getWidth() {
                return width;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public void setDirection(String direction) {
                this.direction = direction;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public void setCrossid(String crossid) {
                this.crossid = crossid;
            }

            public void setWidth(String width) {
                this.width = width;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }
        }

        public static class Road {

            private String distance;

            private String direction;

            private String name;

            private String level;

            private String longitude;

            private String width;

            private String roadid;

            private String latitude;

            public String getDistance() {
                return distance;
            }

            public String getDirection() {
                return direction;
            }

            public String getName() {
                return name;
            }

            public String getLevel() {
                return level;
            }

            public String getLongitude() {
                return longitude;
            }

            public String getWidth() {
                return width;
            }

            public String getRoadid() {
                return roadid;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public void setDirection(String direction) {
                this.direction = direction;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public void setWidth(String width) {
                this.width = width;
            }

            public void setRoadid(String roadid) {
                this.roadid = roadid;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }
        }

        public static class Poi {

            private String distance;

            private String direction;

            private String tel;

            private String name;

            private String weight;

            private String typecode;

            private String longitude;

            private String address;

            private String latitude;

            private String type;

            private String poiid;

            public String getDistance() {
                return distance;
            }

            public String getDirection() {
                return direction;
            }

            public String getTel() {
                return tel;
            }

            public String getName() {
                return name;
            }

            public String getWeight() {
                return weight;
            }

            public String getTypecode() {
                return typecode;
            }

            public String getLongitude() {
                return longitude;
            }

            public String getAddress() {
                return address;
            }

            public String getLatitude() {
                return latitude;
            }

            public String getType() {
                return type;
            }

            public String getPoiid() {
                return poiid;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public void setDirection(String direction) {
                this.direction = direction;
            }

            public void setTel(String tel) {
                this.tel = tel;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public void setTypecode(String typecode) {
                this.typecode = typecode;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public void setType(String type) {
                this.type = type;
            }

            public void setPoiid(String poiid) {
                this.poiid = poiid;
            }
        }

        public String getProvince() {
            return province;
        }

        public List<Cross> getCross_list() {
            return cross_list;
        }

        public String getCode() {
            return code;
        }

        public String getTel() {
            return tel;
        }

        public String getCityadcode() {
            return cityadcode;
        }

        public String getAreacode() {
            return areacode;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public String getPos() {
            return pos;
        }

        public List<Road> getRoad_list() {
            return road_list;
        }

        public String getResult() {
            return result;
        }

        public String getMessage() {
            return message;
        }

        public String getDesc() {
            return desc;
        }

        public String getCity() {
            return city;
        }

        public String getDistrictadcode() {
            return districtadcode;
        }

        public String getDistrict() {
            return district;
        }

        public String getCountry() {
            return country;
        }

        public String getProvinceadcode() {
            return provinceadcode;
        }

        public String getVersion() {
            return version;
        }

        public String getAdcode() {
            return adcode;
        }

        public List<Poi> getPoi_list() {
            return poi_list;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public void setCross_list(List<Cross> cross_list) {
            this.cross_list = cross_list;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public void setCityadcode(String cityadcode) {
            this.cityadcode = cityadcode;
        }

        public void setAreacode(String areacode) {
            this.areacode = areacode;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public void setPos(String pos) {
            this.pos = pos;
        }

        public void setRoad_list(List<Road> road_list) {
            this.road_list = road_list;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setDistrictadcode(String districtadcode) {
            this.districtadcode = districtadcode;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setProvinceadcode(String provinceadcode) {
            this.provinceadcode = provinceadcode;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public void setAdcode(String adcode) {
            this.adcode = adcode;
        }

        public void setPoi_list(List<Poi> poi_list) {
            this.poi_list = poi_list;
        }
    }

    public ResultEntity getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setData(ResultEntity data) {
        this.data = data;
    }
}
