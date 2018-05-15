FROM java:8
ADD . /test
WORKDIR /test

# Download and install Gradle
RUN \
    cd /usr/local && \
    curl -L https://services.gradle.org/distributions/gradle-4.1-bin.zip -o gradle-4.1-bin.zip && \
    unzip gradle-4.1-bin.zip && \
    rm gradle-4.1-bin.zip

RUN apt-get update

# Install chrome
RUN apt-get -y install fonts-liberation xdg-utils libxss1 libappindicator3-1 libindicator7 libgtk-3-0 lsb-release
RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
RUN apt-get -f install -y
RUN dpkg -i google-chrome*.deb

# Install chromedriver
RUN wget -N https://chromedriver.storage.googleapis.com/LATEST_RELEASE -P ~/Downloads
RUN wget -N "http://chromedriver.storage.googleapis.com/`cat ~/Downloads/LATEST_RELEASE`/chromedriver_linux64.zip" -P ~/Downloads
RUN unzip ~/Downloads/chromedriver_linux64.zip -d ~/Downloads
RUN chmod +x ~/Downloads/chromedriver
RUN mv -f ~/Downloads/chromedriver /usr/local/share/chromedriver
RUN ln -s /usr/local/share/chromedriver /usr/local/bin/chromedriver
RUN ln -s /usr/local/share/chromedriver /usr/bin/chromedriver

#Install Headless Display
RUN apt-get -y install xvfb

# Export some environment variables
ENV GRADLE_HOME=/usr/local/gradle-4.1
ENV PATH=$PATH:$GRADLE_HOME/bin

#CMD ["/bin/bash"]
CMD sh run-test.sh