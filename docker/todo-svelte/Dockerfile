FROM node:14-alpine

WORKDIR /app

COPY . .
RUN npm install
RUN npm run build
RUN npm prune --production # Remove dev dependencies

EXPOSE 5000
ENV HOST=0.0.0.0

CMD [ "npm", "start" ]

# # Build environment
# FROM node:16.15-alpine3.15 as build
# WORKDIR /app
# ENV PATH /app/node_modules/.bin:$PATH
# COPY package.json ./
# COPY package-lock.json ./
# RUN npm ci --silent
# COPY . ./
# RUN npm run build

# # production environment
# FROM nginx:1.20.2-alpine
# COPY --from=build /app/dist /usr/share/nginx/html
# COPY container-config/nginx.conf /etc/nginx/conf.d/default.conf
# EXPOSE 80
# CMD ["nginx", "-g", "daemon off;"]