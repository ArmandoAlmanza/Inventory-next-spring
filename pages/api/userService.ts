import axiosInstance from "./axios";
// import { User } from "../../interfaces/user";
import { Product } from "../../interfaces/Product";

const axios = axiosInstance;

export const getUser = async (id: string) => {
    await axios.get("/users/" + id);
};
