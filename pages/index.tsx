import Head from "next/head";

export default function Home() {
    return (
        <div className="flex flex-col justify-center items-center">
            <Head>
                <title>Inventory</title>
                <link rel="icon" href="/favicon.ico" />
            </Head>

            <h1 className="text-xl">Hello world from Next.js</h1>
        </div>
    );
}
