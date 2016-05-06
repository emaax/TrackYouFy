/*
package com.example.em.trackyoufy;

import java.util.Map;

*/
/**
 * Created by emiliaaxen on 16-05-05.
 *//*

public class Album {

    private List<Artist> artists = new ArrayList<Artist>();
    private List<String> availableMarkets = new ArrayList<String>();
    private List<Copyright> copyrights = new ArrayList<Copyright>();
    private ExternalIds externalIds;
    private ExternalUrls_ externalUrls;
    private List<Object> genres = new ArrayList<Object>();
    private String href;
    private String id;
    private List<Image> images = new ArrayList<Image>();
    private String name;
    private int popularity;
    private String releaseDate;
    private String releaseDatePrecision;
    private Tracks tracks;
    private String type;
    private String uri;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    */
/**
     * No args constructor for use in serialization
     *
     *//*

    public Album() {
    }

    */
/**
     *
     * @param externalIds
     * @param genres
     * @param albumType
     * @param copyrights
     * @param tracks
     * @param type
     * @param uri
     * @param id
     * @param artists
     * @param releaseDate
     * @param externalUrls
     * @param name
     * @param availableMarkets
     * @param images
     * @param releaseDatePrecision
     * @param href
     * @param popularity
     *//*

    public Album(String albumType, List<Artist> artists, List<String> availableMarkets, List<Copyright> copyrights, ExternalIds externalIds, ExternalUrls_ externalUrls, List<Object> genres, String href, String id, List<Image> images, String name, int popularity, String releaseDate, String releaseDatePrecision, Tracks tracks, String type, String uri) {
        this.albumType = albumType;
        this.artists = artists;
        this.availableMarkets = availableMarkets;
        this.copyrights = copyrights;
        this.externalIds = externalIds;
        this.externalUrls = externalUrls;
        this.genres = genres;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.popularity = popularity;
        this.releaseDate = releaseDate;
        this.releaseDatePrecision = releaseDatePrecision;
        this.tracks = tracks;
        this.type = type;
        this.uri = uri;
    }

    */
/**
     *
     * @return
     * The albumType
     *//*

    public String getAlbumType() {
        return albumType;
    }

    */
/**
     *
     * @param albumType
     * The album_type
     *//*

    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }

    public Album withAlbumType(String albumType) {
        this.albumType = albumType;
        return this;
    }

    */
/**
     *
     * @return
     * The artists
     *//*

    public List<Artist> getArtists() {
        return artists;
    }

    */
/**
     *
     * @param artists
     * The artists
     *//*

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Album withArtists(List<Artist> artists) {
        this.artists = artists;
        return this;
    }

    */
/**
     *
     * @return
     * The availableMarkets
     *//*

    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    */
/**
     *
     * @param availableMarkets
     * The available_markets
     *//*

    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    public Album withAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
        return this;
    }

    */
/**
     *
     * @return
     * The copyrights
     *//*

    public List<Copyright> getCopyrights() {
        return copyrights;
    }

    */
/**
     *
     * @param copyrights
     * The copyrights
     *//*

    public void setCopyrights(List<Copyright> copyrights) {
        this.copyrights = copyrights;
    }

    public Album withCopyrights(List<Copyright> copyrights) {
        this.copyrights = copyrights;
        return this;
    }

    */
/**
     *
     * @return
     * The externalIds
     *//*

    public ExternalIds getExternalIds() {
        return externalIds;
    }

    */
/**
     *
     * @param externalIds
     * The external_ids
     *//*

    public void setExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
    }

    public Album withExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
        return this;
    }

    */
/**
     *
     * @return
     * The externalUrls
     *//*

    public ExternalUrls_ getExternalUrls() {
        return externalUrls;
    }

    */
/**
     *
     * @param externalUrls
     * The external_urls
     *//*

    public void setExternalUrls(ExternalUrls_ externalUrls) {
        this.externalUrls = externalUrls;
    }

    public Album withExternalUrls(ExternalUrls_ externalUrls) {
        this.externalUrls = externalUrls;
        return this;
    }

    */
/**
     *
     * @return
     * The genres
     *//*

    public List<Object> getGenres() {
        return genres;
    }

    */
/**
     *
     * @param genres
     * The genres
     *//*

    public void setGenres(List<Object> genres) {
        this.genres = genres;
    }

    public Album withGenres(List<Object> genres) {
        this.genres = genres;
        return this;
    }

    */
/**
     *
     * @return
     * The href
     *//*

    public String getHref() {
        return href;
    }

    */
/**
     *
     * @param href
     * The href
     *//*

    public void setHref(String href) {
        this.href = href;
    }

    public Album withHref(String href) {
        this.href = href;
        return this;
    }

    */
/**
     *
     * @return
     * The id
     *//*

    public String getId() {
        return id;
    }

    */
/**
     *
     * @param id
     * The id
     *//*

    public void setId(String id) {
        this.id = id;
    }

    public Album withId(String id) {
        this.id = id;
        return this;
    }

    */
/**
     *
     * @return
     * The images
     *//*

    public List<Image> getImages() {
        return images;
    }

    */
/**
     *
     * @param images
     * The images
     *//*

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Album withImages(List<Image> images) {
        this.images = images;
        return this;
    }

    */
/**
     *
     * @return
     * The name
     *//*

    public String getName() {
        return name;
    }

    */
/**
     *
     * @param name
     * The name
     *//*

    public void setName(String name) {
        this.name = name;
    }

    public Album withName(String name) {
        this.name = name;
        return this;
    }

    */
/**
     *
     * @return
     * The popularity
     *//*

    public int getPopularity() {
        return popularity;
    }

    */
/**
     *
     * @param popularity
     * The popularity
     *//*

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public Album withPopularity(int popularity) {
        this.popularity = popularity;
        return this;
    }

    */
/**
     *
     * @return
     * The releaseDate
     *//*

    public String getReleaseDate() {
        return releaseDate;
    }

    */
/**
     *
     * @param releaseDate
     * The release_date
     *//*

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Album withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    */
/**
     *
     * @return
     * The releaseDatePrecision
     *//*

    public String getReleaseDatePrecision() {
        return releaseDatePrecision;
    }

    */
/**
     *
     * @param releaseDatePrecision
     * The release_date_precision
     *//*

    public void setReleaseDatePrecision(String releaseDatePrecision) {
        this.releaseDatePrecision = releaseDatePrecision;
    }

    public Album withReleaseDatePrecision(String releaseDatePrecision) {
        this.releaseDatePrecision = releaseDatePrecision;
        return this;
    }

    */
/**
     *
     * @return
     * The tracks
     *//*

    public Tracks getTracks() {
        return tracks;
    }

    */
/**
     *
     * @param tracks
     * The tracks
     *//*

    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    public Album withTracks(Tracks tracks) {
        this.tracks = tracks;
        return this;
    }

    */
/**
     *
     * @return
     * The type
     *//*

    public String getType() {
        return type;
    }

    */
/**
     *
     * @param type
     * The type
     *//*

    public void setType(String type) {
        this.type = type;
    }

    public Album withType(String type) {
        this.type = type;
        return this;
    }

    */
/**
     *
     * @return
     * The uri
     *//*

    public String getUri() {
        return uri;
    }

    */
/**
     *
     * @param uri
     * The uri
     *//*

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Album withUri(String uri) {
        this.uri = uri;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Album withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}


}
*/
