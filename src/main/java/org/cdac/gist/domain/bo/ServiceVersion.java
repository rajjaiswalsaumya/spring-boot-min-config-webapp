package org.cdac.gist.domain.bo;

/**
 * Created by kamalp on 27-04-2015.
 */
public class ServiceVersion {
    String version;

    public ServiceVersion() {
    }

    public ServiceVersion(int version) {
        this.version = String.valueOf(version);
    }

    public ServiceVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServiceVersion)) return false;

        ServiceVersion that = (ServiceVersion) o;

        return getVersion().equals(that.getVersion());

    }

    @Override
    public int hashCode() {
        return getVersion().hashCode();
    }
}
