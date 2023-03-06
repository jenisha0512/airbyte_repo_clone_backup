## Steps to build custom airbyte app for coditation

> Since the requirement was to change the branding in the web UI, changes were neccessary in `airbyte-webapp` and docker image for that should be locally built.

1. Make sure that you have no running docker containers for airbyte.

2. Also make sure there are no docker images for airbyte.

    - To remove all docker images: `docker rmi -f $(docker images -aq)`. NOTE: This will remove all images, even those which are not from airbyte.

3. Check `.env` file for the value of VERSION environment variable. At the time of writing, the value is `0.40.32`.

4. Locally build the `airbyte/webapp` docker image using the following command, [Replace `0.40.32` with whatever value you found in `.env` file.]
```
VERSION=0.40.32 ./gradlew :airbyte-webapp:assemble
```

5. Use the command `docker images -a` to list images and check if `airbyte/webapp` is present with the version tag or not.

6. Finally, use `docker compose up`. This will pull all images except the `airbyte/webapp` image because we already built it locally.